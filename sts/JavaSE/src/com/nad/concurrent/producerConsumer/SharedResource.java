package com.nad.concurrent.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

	private final int capacity=10;
	private Queue<Integer> queue=new LinkedList<Integer>();
	private Random random=new Random();
	
	private Lock theLock=new ReentrantLock();
	private Condition bufferNotFull=theLock.newCondition();
	private Condition bufferNotEmpty=theLock.newCondition();
	
	public void put() {
		try {
			theLock.lock();
			boolean isAdded=false;
			while(queue.size()!=capacity) {
			Integer num=random.nextInt();
			 isAdded=queue.offer(num);
			}
			if(isAdded) {
				System.out.println(Thread.currentThread().getName()+" Produced a number notifing to consumer");
				bufferNotFull.signal();
			}
			while (queue.size()==capacity) {
				System.out.println("Buffer Not Empty waiting Producer "+ Thread.currentThread().getName());
				bufferNotEmpty.await();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			theLock.unlock();
		}
	}
	
	public void get() {
		
		try {
			theLock.lock();
			Integer value=null;
			while(queue.size()!=0) {
				 value=queue.poll();
			}

			if(value != null) {
				System.out.println(Thread.currentThread().getName()+" Consumed object produced by producer notifing to producer");
				bufferNotEmpty.signal();
			}

			while(queue.size()==0) {
				System.out.println(Thread.currentThread().getName()+" Waiting for producer to populate elements");
				bufferNotFull.await();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			theLock.unlock();
		}
	}
}

