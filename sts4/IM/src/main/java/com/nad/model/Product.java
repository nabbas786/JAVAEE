package com.nad.model;

public class Product {

	private String productID;
	private String productName;
	private String type;
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product(String productID, String productName, String type) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.type = type;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", type=" + type + "]";
	}
	
	
}
