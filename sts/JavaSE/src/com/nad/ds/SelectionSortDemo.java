package com.nad.ds;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int [] root= {45,1,18,21,10,9,15,32,43,};
		
		for (int i = 0; i < root.length; i++) {
			int temp=0;
			for (int j = i+1; j < root.length; j++) {
				if(root[i]>root[j]) {
					temp=root[j];
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
