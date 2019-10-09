package com.nad.patterns;

public class TemplateDemo {

	public static void main(String[] args) {
		OrderProcessTemplate ot=new OrderProcessTemplateClient();
		ot.processOrder();
	}
}
