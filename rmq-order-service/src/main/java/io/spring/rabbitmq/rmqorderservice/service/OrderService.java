package io.spring.rabbitmq.rmqorderservice.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.spring.rabbitmq.rmqorderservice.message.InventoryResponseMessage;
import io.spring.rabbitmq.rmqorderservice.message.OrderMessage;
import io.spring.rabbitmq.rmqorderservice.message.config.OrderConfirmationResponseConfig;
import io.spring.rabbitmq.rmqorderservice.message.config.OrderErrorResponseConfig;
import io.spring.rabbitmq.rmqorderservice.message.config.OrderMessageConfig;
import io.spring.rabbitmq.rmqorderservice.model.Order;

@Service
public class OrderService {

	@Autowired
	private RabbitTemplate template;
	
	public ResponseEntity<?> placeOrder(Order order){
	
		OrderMessage message = new OrderMessage();
		
		message.setMessageId(UUID.randomUUID().toString());
		message.setMessage("Order Status");
		message.setSkuCode("ABC-12345-S-BL");
		message.setQuantity(5);
		message.setDate(new Date());

		template.convertAndSend(OrderMessageConfig.INVENTORY_EVENTS_EXCHANGE, 
								OrderMessageConfig.ORDER_STATUS_ROUTING_KEY, 
								message);
						
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@RabbitListener(queues = OrderConfirmationResponseConfig.ORDER_CONFIRMATION_QUEUE)
	public void handleOrderConfirmReponseStatus(InventoryResponseMessage message) {
			System.out.println("Order Placed!!");
			System.out.println(message);
	}
	
	@RabbitListener(queues = OrderErrorResponseConfig.ORDER_ERROR_QUEUE)
	public void handleOrderErrorReponseStatus(InventoryResponseMessage message) {
			System.out.println("Order Placement Error!!");
			System.out.println(message);
	}
	
}
