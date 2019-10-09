package com.nad.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CiclicBarrierDemo {

	private static CyclicBarrier barrier=new CyclicBarrier(4);
	public static void main(String[] args) throws InterruptedException {

		Thread worker1 = new Thread(() -> {
			try {
				Thread.sleep(100);
				barrier.await();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}, "Worker1");
		Thread worker2 = new Thread(() -> {
			try {
				Thread.sleep(200);
				barrier.await();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}, "Worker2");
		Thread worker3 = new Thread(() -> {
			try {
				Thread.sleep(300);
				barrier.await();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}, "Worker3");
		Thread worker4 = new Thread(() -> {
			try {
				Thread.sleep(400);
				barrier.await();
				System.out.println(Thread.currentThread().getName() + " has finished");
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}, "Worker4");

		worker1.start();
		worker2.start();
		worker3.start();
		worker4.start();
		System.out.println(Thread.currentThread().getName() + " has finished");

	}

}
