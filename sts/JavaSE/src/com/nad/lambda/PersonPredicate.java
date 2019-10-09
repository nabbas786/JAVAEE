package com.nad.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonPredicate {

	public static void printPredicate(List<Person> persons,Predicate<Person> predicate,Consumer<Person> consume) {
		for(Person p : persons) {
			if(predicate.test(p)) {
				consume.accept(p);
			}
		}
	}
}
