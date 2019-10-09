package com.nad.concurrent;

public class SingletonDemo {

	/*
	 * Volatile keyword is an indicator to the JVM that when a thread is writing //
	 * this particular value write it to main memory instead of cache //Every thread
	 * write its value in its own ThreadLocal which will not be visible to another
	 * Thread So if thread one creates an instance and writes value in its thread
	 * local and in mean time CPU has been taken then the other thread which will
	 * get the monitor of object will not be able to see the object
	 * 
	 * Using volatile keyword it ensures that Thread will write the value to main memory
	 * 
	 */
	private static volatile SingletonDemo _instance = null;

	private SingletonDemo() {

	}

	// Double check is to make sure if the thread gets exact updated value from
	// another thread and it will increase the performance.
	public static SingletonDemo getInstance() {
		if (_instance == null) {
			synchronized (SingletonDemo.class) {
				if (_instance == null) {
					_instance = new SingletonDemo();
				}
			}
		}
		return _instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
