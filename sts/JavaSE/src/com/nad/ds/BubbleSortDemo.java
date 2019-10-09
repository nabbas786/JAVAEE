package com.nad.ds;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int [] root= {98,39,42,55,2,9,10,20,34,45};
		for (int i = 0; i < root.length-1; i++) {
			for (int j = i+1; j < root.length-1; j++) {
				int temp=root[j];
				if(root[i]>temp) {
					root[j]=root[i];
					root[i]=temp;
				}
			}
			
		}
		for (int i : root) {
			System.out.print(i+" ");
		}
	}
}
