package com.nad.patterns.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		FeedSubject fs=new FeedSubject();
		fs.registerObserver(new NyTimesObserver());
		fs.registerObserver(new Gardian());
		fs.notifyObserver();
	}
}
