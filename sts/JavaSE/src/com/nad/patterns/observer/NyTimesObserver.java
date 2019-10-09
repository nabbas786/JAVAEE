package com.nad.patterns.observer;

public class NyTimesObserver implements Observer{

	@Override
	public void notify(String tweet) {
		if(tweet!=null && tweet.contains("money")) {
			System.out.println("observing tweet NYTimes");
		}
	}

	
}
