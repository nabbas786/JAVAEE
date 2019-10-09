package com.nad.patterns;

public class OrderProcessTemplateClient implements OrderProcessTemplate{

	@Override
	public void doPayment() {
		System.out.println(" Payment is done");
		
	}

	@Override
	public void doSelect() {
		System.out.println("Item is selected");
		
	}

	@Override
	public void giftWrap() {
		System.out.println("gift is wrapped");
		
	}

	@Override
	public void doDelevery() {
		System.out.println("delevery is done");
		
	}

}
