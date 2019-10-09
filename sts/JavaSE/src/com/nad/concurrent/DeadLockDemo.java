package com.nad.concurrent;

public class DeadLockDemo {

	public static void main(String[] args) {
		DeadLockDemo dm = new DeadLockDemo();
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();

		new Thread(() -> {
			synchronized (r1) {
				try {
					r1.test1();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (r2) {
					r2.test2();
				}
			}
		}).start();
		new Thread(() -> {
			synchronized (r2) {
				try {
					r2.test2();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (r1) {
					r1.test1();
				}
			}
		}).start();
	}
}
