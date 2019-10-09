package com.nad.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product_entity")
public class ProductEntity {

	@Id
	private String _id;

	private String productID;
	private String productName;
	private String type;
	public ProductEntity(String _id ,String productID, String productName, String type) {
		super();
		this._id=_id;
		this.productID = productID;
		this.productName = productName;
		this.type = type;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
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
	
	
}
