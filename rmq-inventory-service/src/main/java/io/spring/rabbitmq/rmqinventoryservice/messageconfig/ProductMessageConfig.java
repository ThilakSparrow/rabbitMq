package io.spring.rabbitmq.rmqinventoryservice.messageconfig;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductMessageConfig {

	public final static String PRODUCT_UPDATES_QUEUE = "product.updates.queue";
	public final static String INVENTORY_EVENTS_EXCHANGE = "inventory.events.exchange";
	public final static String PRODUCT_CREATED_ROUTING_KEY = "product.created";

	@Bean
	public Queue queue1() {
		return new Queue(PRODUCT_UPDATES_QUEUE, true);
	}

	@Bean
	public TopicExchange topicExchange1() {
		return new TopicExchange(INVENTORY_EVENTS_EXCHANGE);
	}
	
//	@Bean
//	SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
//			MessageListenerAdapter listenerAdapter) {
//		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
//		container.setConnectionFactory(connectionFactory);
//		container.setQueueNames(INVENTORY_QUEUE);
//		container.setMessageListener(listenerAdapter);
//		return container;
//	}
//	
//	 @Bean
//	  MessageListenerAdapter listenerAdapter(InventoryService inventoryService) {
//	    return new MessageListenerAdapter(inventoryService, "handleReceivingMessage");
//	  }

}


