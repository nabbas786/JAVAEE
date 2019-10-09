package com.nad.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockUsingReentrantLock {

	public static void main(String[] args) {

		DeadLockDemo dm = new DeadLockDemo();
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();
		Lock reentrantLock=new ReentrantLock();
		new Thread(() -> {
				reentrantLock.tryLock();
				try {
					r1.test1();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				reentrantLock.tryLock();
					r2.test2();
				reentrantLock.unlock();
					reentrantLock.unlock();
		}).start();
		new Thread(() -> {
			reentrantLock.tryLock();
				try {
					r2.test2();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				reentrantLock.tryLock();
					r1.test1();
					reentrantLock.unlock();
					reentrantLock.unlock();
		}).start();
	
	}
}
