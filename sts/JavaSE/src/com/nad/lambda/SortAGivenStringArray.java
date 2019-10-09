package com.nad.lambda;

import java.util.Arrays;

public class SortAGivenStringArray {

	public static void main(String[] args) {
		String [] arr= {"342","22","1221","543"};
		
		Arrays.sort(arr, (left, right) -> 
        { 
            if (left.length() != right.length()) 
                return left.length() - right.length(); 
             return left.compareTo(right); 
        }); 
		for (String string : arr) {
			System.out.println(string+" ");
		}
	}
}
