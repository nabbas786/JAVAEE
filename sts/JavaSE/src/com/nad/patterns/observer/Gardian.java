package com.nad.patterns.observer;

public class Gardian implements Observer{

	@Override
	public void notify(String tweet) {
		if(tweet!=null && (tweet.contains("queen") || tweet.contains("Queen"))) {
			System.out.println("Observing tweet Gardian");
		}
	}

	
}
