package com.nad.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchDemo {

	private static CountDownLatch latch = new CountDownLatch(10);

	public static void main(String[] args) throws InterruptedException {

		Thread worker1 = new Thread(() -> {
			try {
				Thread.sleep(100);
				latch.countDown();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"Worker1");
		Thread worker2 = new Thread(() -> {
			try {
				Thread.sleep(200);
				latch.countDown();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"Worker2");
		Thread worker3 = new Thread(() -> {
			try {
				Thread.sleep(300);
				latch.countDown();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"Worker3");
		Thread worker4 = new Thread(() -> {
			try {
				Thread.sleep(400);
				latch.countDown();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		},"Worker4");
		
		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		System.out.println(Thread.currentThread().getName() + " has before");
		latch.await(1, TimeUnit.SECONDS);
		System.out.println(Thread.currentThread().getName() + " has finished");

		
	}
}