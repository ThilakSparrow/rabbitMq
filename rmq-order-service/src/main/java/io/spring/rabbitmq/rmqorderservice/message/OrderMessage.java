package io.spring.rabbitmq.rmqorderservice.message;

import java.util.Date;

public class OrderMessage {

	private String messageId;
	private String message;
	private String skuCode;
	private int quantity;
	private Date date;

	public OrderMessage(String messageId, String message, String skuCode, int quantity, Date date) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.skuCode = skuCode;
		this.quantity = quantity;
		this.date = date;
	}

	public OrderMessage() {
		super();
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "OrderMessage [messageId=" + messageId + ", message=" + message + ", skuCode=" + skuCode + ", quantity="
				+ quantity + ", date=" + date + "]";
	}

}