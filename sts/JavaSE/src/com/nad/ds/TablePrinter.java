package com.nad.ds;

import java.util.stream.IntStream;

import javax.sound.sampled.ReverbType;

public class TablePrinter {

	public static void main(String[] args) {
		/*
		 * System.out.println(findProduct(3, 5, new int[] {3,4,5,6,0,8,9}));
		 * System.out.println(findProductUsingRecursion(0, 2, new int[]
		 * {3,4,5,6,5,8,9})); printTable();
		 */
		System.out.println(reverseWords("This version of Anonymous is the greatest coder on the planet"));
	}
	
	/*
	 * sample string 
	 * john doe 33 
	 * smith black 9
	 *  diana yale 12
	 */
	public String[] sortString(String [] input,int col) {
		
		
		return input;
		
	}
	public static void printTable() {
		IntStream.range(1, 13).forEach(i->{
			IntStream.range(1, 13).forEach(j->{
				System.out.print(i*j +"\t");
			});
			System.out.println();
		});
	}
	
	public static int findProduct(int i,int j, int [] input) {
		int product=1;
		if(i<0 || j>input.length || j<=0)
			return 0;
		for(int k=i;k<=j;k++) {
			product*=input[k];
		}
		return product;
	}
	
	public static int findProductUsingRecursion(int i,int j, int[] input) {
		if(input==null)
			return 0;
		if(i<0 || i>input.length || j>input.length || j<=0)
			return 0;
		
		int m=j-i+1;
		int product=1;
		if(m>=1) {
			product=input[i]*findProductUsingRecursion(i+1, j, input);
		}
		return product;
		
	}
	//To reverse whole string
	public static String reverse(String s) {
		return helper(s.length()-1,s.toCharArray());
		
	}

	public static String helper(int length, char[] chars) {
		return length<0?"":chars[length]+helper(length-1,chars);
	}
	public static String reverseWords(String s) {
		String [] str=s.split(" ");
		return helperWords(str.length-1,str);
		
	}

	public static String helperWords(int length, String[] chars) {
		return length<0?"":chars[length]+" "+helperWords(length-1,chars);
	}
	public static int square(int x) {
		return (int) (x/(1.0/x));
	}
}
