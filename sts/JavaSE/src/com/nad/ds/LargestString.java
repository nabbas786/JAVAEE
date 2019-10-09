package com.nad.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestString {
	
	public String largestNumber(int[] nums) {
        return largestNumberUtil(IntStream.of(nums).boxed().toArray(Integer[]::new));
	}

	private String largestNumberUtil(Integer[] nums) {
		if (nums == null || nums.length == 0) return "0";

		return formatOutput(
				String.join(
						"",
						Arrays.asList(nums).stream()
								.map(num ->   num.toString())
								.sorted((x,y) -> y.concat(x).compareTo(x.concat(y)))
								.collect(Collectors.toList())
				)
		);
	}

	private String formatOutput(String s) {
		return (s.startsWith("0")) ? "0" : s;
	}
	
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		System.out.println(new LargestString().findRepeatedDnaSequences("AAAAAAAAAAA"));
		System.out.println(System.currentTimeMillis()-startTime);
	}
	 public List<String> findRepeatedDnaSequences(String s) {
		 HashMap<String, Integer> dna=new HashMap<>();
		 List<String> res= new ArrayList<String>();
		 if(s.length()<=10) {
			 return res;
		 }
	        for(int i=0;i<s.length()-9;i++) {
		        String temp=s.substring(i, i+10);
		        if(dna.containsKey(temp)) {
		        	dna.put(temp, dna.get(temp)+1);
		        }else {
		        	dna.put(temp,1);
		        }
	        }
		 for(Entry<String, Integer> entry : dna.entrySet()) {
			 if(entry.getValue()>1)
				 res.add(entry.getKey());
		 }
		 return res;
	    }

}
