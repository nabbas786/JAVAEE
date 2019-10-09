package com.nad.lambda;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class LambdaTest {

	public static void main(String[] args) {
		
		/*Person p1 = new Person("ass", 23, "male");
		Person p2 = new Person("me", 29, "female");
		Person p3 = new Person("gas", 24, "male");
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		Map<String, Integer> personMap=new HashMap<String, Integer>();
		PersonPredicate.printPredicate(persons,
				p -> p.getGender().equalsIgnoreCase("male") && p.getAge() > 20 && p.getAge() < 30,
				p -> personMap.put(p.name, p.age));
		System.out.println(personMap);
		}*/
	
		/*
		 * File[] file=new File("c://").listFiles(File :: isHidden); for (File file2 :
		 * file) { System.out.println(file2.canRead()); }
		 */
		Function<String, String> function=String::toUpperCase;
		System.out.println(function.apply("nadeem"));
		
		List<String> str = Arrays.asList("a","b","A","B");
		str.sort(String::compareToIgnoreCase);
		System.out.println(str);
		ToIntFunction<String> stringToInt =Integer::parseInt;
		System.out.println(stringToInt.applyAsInt("12345"));
		BiPredicate<List<String>, String> contains =List ::contains;
		
		Function<String, Person> personBuilder=Person:: new;
		Person p=personBuilder.apply("nadeem");
		System.out.println(p.toString());
		
		PersonFuction<String, Integer, String, Person> personBulder=Person::new;
		System.out.println(personBulder.getPerson("prachi", 25, "unknown"));
		Person p1 = new Person("ass", 23, "male");
		Person p2 = new Person("me", 29, "female");
		Person p3 = new Person("gas", 24, "male");
		List<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.sort((a,b)-> a.getAge().compareTo(b.getAge()));
		
		Comparator<Person> comparator=Comparator.comparing((Person a)->a.getAge());
		persons.sort(comparator);
		persons.sort(Comparator.comparing((Person a)->a.getAge()));
		persons.sort(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName).thenComparing(Person::getGender));
		System.out.println(persons);
		
		Predicate<Person> agedAndMale=((a)->a.getAge()>60);
		agedAndMale.and((a)->a.getGender().equalsIgnoreCase("Male")).or((a)->a.getName().equals("ass"));
	}
		
}
