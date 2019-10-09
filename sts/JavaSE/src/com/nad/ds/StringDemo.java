package com.nad.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;import org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;

public class StringDemo {

	public static void main(String[] args) {
		/*
		 * System.out.println(convertString("Nadeem"));
		 * System.out.println(repetingLetters("aaabbcccnnddd")); String[]
		 * res=findMatchingWords(new String[] {"otse","tse","eo","stoe"}, new char[]
		 * {'e','o','t','s'}); System.out.println(res);
		 */
		/*
		 * System.out.println(groupAnagrams(new String[] {"cat", "dog", "tac", "god",
		 * "act"}));
		 */
		System.out.println(findFirstNonRepeating("GeeksOfGeeeks"));
	}
	public static char findFirstNonRepeating(String str) {
		char [] chars=getCharCountArray(str);
		int index=-1;
		for(int i=0;i<str.length();i++) {
			if(chars[str.charAt(i)]==1) {
				index=i;
				break;
			}
		}
		return str.charAt(index);
	}
	 static char[] getCharCountArray(String str)  
     { 
		 char count[] = new char[256]; 
         for (int i = 0; i < str.length();  i++) 
              count[str.charAt(i)]++; 
         return count;
     } 
	public static String convertString(String s) {
	
		char ch[] =s.toCharArray();
		StringBuffer sb=new StringBuffer();
		for(char c : ch) {
			int temp=(int)c+1;
			sb.append((char)temp);
		}
		return sb.toString();
	}
	
	//aaabbccc
	//a3b2c3
	//a3b2c3d3n2

	public static String repetingLetters(String str) {
		char[] chars=str.toCharArray();
		HashMap<Character, Integer> countChars=new HashMap<>();
		for(Character c : chars) {
			if(countChars.containsKey(c)) {
				countChars.computeIfPresent(c, (k,v)-> v+1);
			}
			countChars.computeIfAbsent(c, k->1);
		}
		Set<Character> keys=countChars.keySet();
		StringBuilder sb=new StringBuilder();
		
		for(Character c: keys) {
			sb.append(c);
			sb.append(countChars.get(c));
		}
		return sb.toString();
	}
	
	public static String [] findMatchingWords(String [] words,char[] chars) {
		Arrays.sort(chars);
		String key=String.copyValueOf(chars);
		List<String> res=new ArrayList<>();
		for(String str: words) {
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String newStr=String.copyValueOf(ch);
			if(newStr.equalsIgnoreCase(key))
				res.add(str);
		}
		return res.toArray(new String[res.size()]);
		
	}
	
	//{�cat�, �dog�, �tac�, �god�, �act�},
	//(dog, god) (cat, tac, act)
	public static Collection<List<String>> groupAnagrams(String [] words){
		Map<String, List<String>> anagrams=new HashMap<>();
		for(String str : words) {
			char[] ch=str.toCharArray();
			Arrays.sort(ch);
			String key=String.copyValueOf(ch);
			if(anagrams.containsKey(key)) {
				anagrams.get(key).add(str);
			}else {
				ArrayList<String> val=new ArrayList<>();
				val.add(str);
				anagrams.put(key, val);
			}
		}
	return anagrams.values();
	}
	
}
