package com.nad.patterns.observer;

public interface TweetSubject {
	void registerObserver(Observer observer);
	void notifyObserver();
}
