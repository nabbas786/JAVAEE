package com.nad.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySumProblem {

	public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); int
		 * len=Integer.parseInt(br.readLine()); String[] nums =
		 * br.readLine().split(" "); // Reading input from STDIN int[] arr =
		 * Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();
		 * Arrays.stream(arr).max(); Arrays.sort(arr); int initialSum = 0, actualSum =
		 * 0; for (Integer s : arr) { initialSum += s; } for (Integer s : arr) {
		 * actualSum = s* len; if (actualSum > initialSum) { System.out.println(s);
		 * break; }
		 * 
		 * }
		 */
		//findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 });
		System.out.println(myAtoi("1234"));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int max = 0;
		int min = 0;
		for (int i : nums1) {
			if (max < i)
				max = i;
		}
		for (int i : nums2) {
			if (min == 0 || min > i)
				min = i;
		}
		return (max + min) / 2;

	}

	public static int reverse(int x) {
		boolean isNegative=false;
		if(x<0) {
			isNegative=true;
			x=Math.abs(x);
		}
		int result = 0;
		int temp = 1;
		int tempV=x;
		while (tempV > 10) {
			temp *= 10;
			tempV /= 10;
		}
		while (x >= 1) {
			int d = x % 10;
			result += (d * (temp=temp>0?temp:1));
			x /= 10;
			temp /= 10;
		}
		if(isNegative) {
			result=-result;
		}
		return result;
	}
    public static int myAtoi(String str) {
    	int result=0,multmin=0,radix=10,limit=0,i=0,digit;
    	boolean negative=false;
    	for(String s : str.split(" ")) {
    		int len=s.length();
    		if(len>0) {
                char firstChar = s.charAt(0);
                if (firstChar < '0') { // Possible leading "+" or "-"
                    if (firstChar == '-') {
                        negative = true;
                        limit = Integer.MIN_VALUE;
                    } else if (firstChar != '+')

                    if (len == 1) // Cannot have lone "+" or "-"
                    i++;
                }
                multmin = limit / radix;
                while (i < len) {
                    // Accumulating negatively avoids surprises near MAX_VALUE
                    digit = Character.digit(s.charAt(i++),radix);
                    if (digit < 0) {
                        throw new NumberFormatException(s);
                    }
                    if (result < multmin) {
                    	throw new NumberFormatException(s);
                    }
                    result *= radix;
                    if (result < limit + digit) {
                    	throw new NumberFormatException(s);
                    }
                    result -= digit;
                }
            }
    	}
    	return negative ? -result : result;
    }

}
