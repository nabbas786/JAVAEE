package com.nad.streams;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamNumeric {

	public static void main(String[] args) {
		int [] nums=new int[] {1,2,3,4,5};
		int sum=Arrays.stream(nums).sum();
		int max=Arrays.stream(nums).max().getAsInt();
		int avg=(int) Arrays.stream(nums).average().getAsDouble();
		System.out.println(sum +" "+max+" " +avg);
		
		try (Stream<String> lines=Files.lines(Paths.get("src/words.txt"))){
			List<String> uniqueWords=lines.flatMap(line->Arrays.stream(line.split(","))).distinct().collect(Collectors.toList());
			System.out.println(uniqueWords);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
