package com.nad.lambda;

public class MyLambda {

	public static void main(String[] args) {
		new MyLambda().doSomthing();
		StringIndex index=String::indexOf;
		System.out.println(index.find("dddabc", "abc"));
	}
	public void doSomthing() {
		 StringHash myLambd=new String("sajid") :: hashCode;
		 System.out.println(myLambd.hash()+" " +"nadeem".hashCode());
	}
}
