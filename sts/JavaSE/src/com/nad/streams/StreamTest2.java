package com.nad.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("hello","nadeem","how","are","you");
		Set<Character> charSet=new HashSet<>();
		words.forEach(s1->{
		char[] word=s1.toCharArray();
		for (int i = 0; i < word.length; i++) {
			charSet.add(word[i]);
		}
		});
		System.out.println(charSet);
		
		System.out.println(words.stream().map(word->word.split("")).distinct().collect(Collectors.toList()));
		String [] wordsArray={"hello","nadeem","how","are","you"};
		System.out.println(Arrays.stream(wordsArray).map(word->word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));
		int [] nums={2,3,4,5};
		//Arrays.stream(nums).map(num -> num*num).collect(Collectors.toList());
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);
		List<int[]> numList = numbers1.stream().flatMap(i -> numbers2.stream().map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
		numList.forEach(num -> Arrays.stream(num).forEach(System.out::print));
		List<int[]> numList2 = numbers1.stream()
				.flatMap(i -> numbers2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[] { i, j }))
				.collect(Collectors.toList());
		numList2.forEach(num2 -> Arrays.stream(num2).forEach(System.out::print));
	}
}
