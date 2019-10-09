package com.nad.patterns;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ValidationStratagyClient {

	public static void main(String[] args) {
		//Providing stratagy at run time 
		ValidationStratagy LowerCaseValidatoin=(s)->s.matches("[a-z]+");
		//Providing validation stratigy for nueric comparison
		ValidationStratagy numericValidation=(s->s.matches("\\d+"));
		System.out.println(LowerCaseValidatoin.execute("abcd"));
		System.out.println(LowerCaseValidatoin.execute("1234"));
		System.out.println(numericValidation.execute("1234"));
		System.out.println(numericValidation.execute("abcd"));
	}
}
