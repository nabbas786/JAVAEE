package com.nad.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GenericLambdaUsecases {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("nadeem");
		names.add("sajid");
		names.add("eram");
		names.add("nadeem");
		names.add("sajid");
		names.add("majid");
		names.add("nadeem");
		names.add("sajid");
		names.add("sajid");
		names.add("eram");
		names.add("eram");
		
		//find the ocurrance of each word and print in descending order
		
		Map<String, Integer> occuranceMap=new HashMap<>();
		names.forEach(name -> {
			occuranceMap.computeIfAbsent(name, v->0);
			occuranceMap.computeIfPresent(name, (k,v)->v+1);
			/*
			 * if (occuranceMap.containsKey(name)) { int a = occuranceMap.get(name);
			 * occuranceMap.put(name, ++a); } else { occuranceMap.put(name, 1); }
			 */
		});
		occuranceMap.entrySet().stream().sorted(Entry.comparingByValue()).forEachOrdered(System.out:: println);;
		System.out.println(occuranceMap.getOrDefault("nad", 1));
	}
}
