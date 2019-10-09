package com.nad.patterns;

public interface OrderProcessTemplate {
    boolean isGift=false;
	public void doPayment();
	public void doSelect();
	public void giftWrap();
	public void doDelevery();
	
	default  void processOrder() {
		
		doSelect();
		doPayment();
		if(isGift) {
			giftWrap();
		}
		doDelevery();
	}
}
