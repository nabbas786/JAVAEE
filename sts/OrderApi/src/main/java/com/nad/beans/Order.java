package com.nad.beans;

public class Order {

	String productId;
	String price;
	String address;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Order(String productId, String price, String address) {
		super();
		this.productId = productId;
		this.price = price;
		this.address = address;
	}
	public Order() {
	}
	@Override
	public String toString() {
		return "Order [productId=" + productId + ", price=" + price + ", address=" + address + "]";
	}
	
	
}
