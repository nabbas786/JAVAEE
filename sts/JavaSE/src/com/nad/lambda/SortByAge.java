package com.nad.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByAge {

	public static void main(String[] args) {
		Person []p1= {new Person("nadeem", 29, "male"),new Person("sajid", 24, "male"),new Person("Eram", 30, "female")};
		
		Arrays.sort(p1, (a,b) -> Person.compareByAge(a, b));
		for (Person person : p1) {
			System.out.println();
			System.out.println(person);
		}
	
	}
}
