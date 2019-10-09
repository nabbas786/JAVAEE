package com.nad.beans;

public class OrderDetails {

	String orderId;
	String orderConfirmation;
	String delevryDetails;
	public OrderDetails(String orderId, String orderConfirmation, String delevryDetails) {
		super();
		this.orderId = orderId;
		this.orderConfirmation = orderConfirmation;
		this.delevryDetails = delevryDetails;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderConfirmation() {
		return orderConfirmation;
	}
	public void setOrderConfirmation(String orderConfirmation) {
		this.orderConfirmation = orderConfirmation;
	}
	public String getDelevryDetails() {
		return delevryDetails;
	}
	public void setDelevryDetails(String delevryDetails) {
		this.delevryDetails = delevryDetails;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderConfirmation=" + orderConfirmation + ", delevryDetails="
				+ delevryDetails + "]";
	}
	
	
}
