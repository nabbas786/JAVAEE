package com.nad.concurrent;

public class ThreadJoinDemo extends Thread {
	static ThreadJoinDemo thread1;

	@Override
	public void run() {
		try {
			synchronized (thread1) {
				System.out.println(Thread.currentThread().getName() + " acquired a lock on thread1");
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName() + " completed");
			}
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) throws Exception {
		thread1 = new ThreadJoinDemo();
		thread1.setName("thread1");
		thread1.start();

		synchronized (thread1) {
			System.out.println(Thread.currentThread().getName() + " acquired a lock on thread1");
			Thread.sleep(9000);
			thread1.join();
			System.out.println(Thread.currentThread().getName() + " completed");
		}
	}
}
