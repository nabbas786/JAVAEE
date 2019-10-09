package com.nad.concurrent.blocking;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LinkedBlockingQueue<E> {

	private Queue<E> elements=new LinkedList<E>();
	private Lock theLock=new ReentrantLock();
	private Condition queueEmptyCondition=theLock.newCondition();
	private Condition queueFullCondition=theLock.newCondition();
	private int count;
	private int putIndex;
	
	public LinkedBlockingQueue(int limit) {
		this.count=limit;
	}
	public void put(E element) {
		if(element !=null) {
			ReentrantLock lock=(ReentrantLock) this.theLock;
			try {
				lock.lockInterruptibly();
				if(count==elements.size()) {
					queueFullCondition.await();
				}
				enque(element);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		}
	}
	public void enque(E element) {
		elements.add(element);
		putIndex++;
		if(putIndex==elements.size()) {
			putIndex=0;
		}
		queueEmptyCondition.signal();
	}
	public E take() {
		final ReentrantLock lock=(ReentrantLock) this.theLock;
		try {
			lock.lockInterruptibly();
			while (count==0) {
				queueEmptyCondition.await();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return elements.remove();
	}
}
