package com.nad.ds;

import java.util.Arrays;
import java.util.stream.Stream;

public class QucikSort {

	public static int partition(int[] arr,int low,int high) {
		
		int pivot=arr[high];
		
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			
			if(arr[j]<=pivot) {
				i++;
				
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp;
			}
		}
		int temp = arr[i+1]; 
		arr[i+1] = pivot; 
		arr[high] = temp;
		return i+1;
		
	}
	
	public static int[] quickSort(int[] arr,int low,int high) {
		/*
		 * if (high - low < 2) { return arr; }
		 */
		if(low<high) {
			int pi=partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
		
		
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		int []arr=quickSort(new int[] {43,45,87,98,4,89}, 0, 5);
		Arrays.stream(arr).forEach(a->System.out.print(a+" "));
	}
}
