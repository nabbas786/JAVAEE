package com.nad.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FeedSubject implements TweetSubject{
	private List<Observer> observers=new ArrayList<Observer>();
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObserver() {
		observers.forEach(observer-> observer.notify("Queen is spending lot of money"));
	}

}
