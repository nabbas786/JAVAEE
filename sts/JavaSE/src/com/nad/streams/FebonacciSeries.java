package com.nad.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FebonacciSeries {

	public static void main(String[] args) {
		//0 1 1 2 3 5 
		int feb[]=new int[20];
		feb[0]=0;
		feb[1]=1;
		for (int k = 2; k < 20; k++) {
			feb[k]=feb[k-1]+feb[k-2];
		}
		for (int i = 0; i < feb.length; i++) {
			System.out.print(feb[i]+" ");
		}
		List<int[]> feb1=Stream.iterate(new int[]{0, 1},
				 t -> new int[]{t[1], t[0]+t[1]})
				 .limit(20).collect(Collectors.toList());
		System.out.println(feb1);

	}
	
	
}
