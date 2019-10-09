package com.nad.ds;

import java.util.Stack;

public class StackSort {

	public static Stack<Integer> sortStack(Stack<Integer> input){
		
		Stack<Integer> temp=new Stack<>();
		while (!input.isEmpty()) {
			int num=input.pop();
			while (!temp.isEmpty() && temp.peek()>num) {
				input.push(temp.pop());
				
			}
			temp.push(num);
		}
		return temp;
	}
	 public static void main(String a[]){
         
	        Stack<Integer> input = new Stack<Integer>();
	        input.add(34);
	        input.add(3);
	        input.add(31);
	        input.add(98);
	        input.add(92);
	        input.add(23);
	        System.out.println("input: "+input);
	        System.out.println("final sorted list: "+sortStack(input));
	    }
}
