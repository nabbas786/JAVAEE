package com.nad.ds;

import java.util.Arrays;
import java.util.Collection;

public class ArrayList1<E> {

	private transient Object [] elementArray;
	private int initialCapacity=10;
	private int size=0;
	public ArrayList1() {
		this.elementArray=new Object[initialCapacity];
	}
	public ArrayList1(int capacity) {
		if (capacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
            		capacity);
		this.initialCapacity=capacity;
		this.elementArray=new Object[initialCapacity];
	}
	public ArrayList1(Collection<? extends E> c) {
		elementArray=c.toArray();
		if (elementArray.getClass() != Object[].class)
			elementArray = Arrays.copyOf(elementArray, size, Object[].class);
	}
	public boolean add(Object data) {
		this.ensureCapacity(size+1);
		this.elementArray[size++]=data;
		return true;
	}
	
	public void ensureCapacity(int size) {
		int oldCapacity=elementArray.length;
		int newCapacity=(oldCapacity*3)/2+1;
		java.util.ArrayList l=new java.util.ArrayList<E>();
		
	}
}
