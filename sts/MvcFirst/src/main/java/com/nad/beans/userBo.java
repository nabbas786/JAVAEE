package com.nad.beans;

public class userBo {

	private String id,name,contact;

	public userBo(String id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "userBo [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}
	
	
	
}
