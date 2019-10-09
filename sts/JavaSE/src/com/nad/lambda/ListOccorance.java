package com.nad.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ListOccorance {

	public static void findOccurance(List<String> list,Predicate<String> p2,BiPredicate<String, Integer> bp) {
		for(String name : list) {
			if(p2.test(name)) {
				bp.test(name, 1);
			}else {
				bp.test(name, 1);
			}
		}
	}
	public static void findOccurance(List<String> list,Consumer<String> c) {
		for(String name : list) {
			c.accept(name);
		}
	}
	public static void main(String[] args) {
		List<String> names=Arrays.asList("mohammed","eram","sajid","nadeem","sajid","nadeem");
		Map<String, Integer> occuranceMap=new TreeMap<String, Integer>();
		
		/*
		 * findOccurance(names, c1 -> { if (occuranceMap.containsKey(c1))
		 * occuranceMap.put(c1, occuranceMap.get(c1) + 1); else occuranceMap.put(c1, 1);
		 * 
		 * }, names :: contains);
		 */
		 
		findOccurance(names, names::contains,(name,occur) -> {occuranceMap.put(name, occur); return true;});
		System.out.println(occuranceMap);
	}
}
