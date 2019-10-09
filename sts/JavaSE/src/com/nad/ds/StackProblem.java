package com.nad.ds;

import java.util.Stack;

public class StackProblem {

	public static Stack<Integer> sortStack(Stack<Integer> stk){
		Stack<Integer> tempStack=new Stack<Integer>();
		
		while(!stk.isEmpty()) {
			int val=stk.pop();
			
			while(!tempStack.isEmpty() && tempStack.peek()>val) {
				stk.push(tempStack.pop());
			}
			tempStack.push(val);
		}
		return tempStack;
	}
	
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.push(20);
		stk.push(12);
		stk.push(32);
		stk.push(23);
		stk.push(90);
		stk.push(1);
		stk.push(45);
		Stack<Integer> res=sortStack(stk);
		
		res.forEach(System.out::println);
	}
}
