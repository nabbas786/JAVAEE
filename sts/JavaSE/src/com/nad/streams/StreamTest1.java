package com.nad.streams;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
				 new Dish("pork", false, 800, Dish.Type.MEAT),
				 new Dish("beef", false, 700, Dish.Type.MEAT),
				 new Dish("chicken", false, 400, Dish.Type.MEAT),
				 new Dish("french fries", true, 530, Dish.Type.OTHER),
				 new Dish("rice", true, 350, Dish.Type.OTHER),
				 new Dish("season fruit", true, 120, Dish.Type.OTHER),
				 new Dish("pizza", true, 550, Dish.Type.OTHER),
				 new Dish("prawns", false, 300, Dish.Type.FISH),
				 new Dish("salmon", false, 450, Dish.Type.FISH) );

		List<String> dishWithLessCalories=menu.stream().filter(a -> a.getCalories()>300).sorted(Comparator.comparing(Dish::getCalories))
				.map(Dish::getName).collect(Collectors.toList());
		dishWithLessCalories=menu.stream().filter((Dish a)->{System.out.println("Filtering : "+a.getName());
		return a.getCalories() >300;
		}).limit(3).map(dish->{
			System.out.println("mapping : "+dish.getName());
			return dish.getName();
		}).collect(Collectors.toList());
		
		System.out.println(dishWithLessCalories);
	}
}
