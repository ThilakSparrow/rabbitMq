package io.spring.rabbitmq.rmqproductservice;

import java.util.Date;


public class ProductMessage {

	private String messageId;
	private String message;
	private String productName;
	private int quantity;
	private String skuCode;
	private Date date;
	private UpdateType updateType;
	
	public enum UpdateType {CREATE, UPDATE, DELETE}
	
	public ProductMessage() { super(); }

	public ProductMessage(String messageId, String message, String productName, int quantity, String skuCode,
			Date date, UpdateType updateType) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.productName = productName;
		this.quantity = quantity;
		this.skuCode = skuCode;
		this.date = date;
		this.updateType = updateType;
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

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public UpdateType getUpdateType() {
		return updateType;
	}

	public void setUpdateType(UpdateType updateType) {
		this.updateType = updateType;
	}

	@Override
	public String toString() {
		return "ProductUpdateMessage [messageId=" + messageId + ", message=" + message + ", productName=" + productName
				+ ", quantity=" + quantity + ", skuCode=" + skuCode + ", date=" + date + ", updateType=" + updateType
				+ "]";
	}

	

	

	
	

}
