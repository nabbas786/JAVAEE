package com.nad.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.nad.streams.Dish.Type;

import static java.util.stream.Collectors.*;
public class CollectorsDemo {

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
		
		Dish maxCaloryDish=menu.stream().collect(Collectors.maxBy(Comparator.comparing(Dish :: getCalories))).get();
		System.out.println(maxCaloryDish);
		Dish dish=menu.stream().collect(Collectors.reducing((d1,d2)-> d1.getCalories() > d2.getCalories() ? d1 : d2)).get();
		System.out.println(dish);
		Map<Dish.Type, List<Dish>> groupByDish=menu.stream().collect(Collectors.groupingBy(Dish::getType));
		System.out.println(groupByDish);
		Map<Type, Map<Object, List<Dish>>> gorupByFIlteringDished=menu.stream().collect(groupingBy(Dish::getType,groupingBy(
			dish1 -> {if(dish1.getCalories()<=400 ) return "DIET";
			else if(dish1.getCalories()<=700) return "Normal";
			else
				return "FAT";
		})));
		System.out.println(gorupByFIlteringDished);
		System.out.println(menu.stream().collect(groupingBy(Dish::getType,counting())));
		
		//partitioning dishes based on veggi or non-veg
		System.out.println(menu.stream().collect(partitioningBy(Dish::isVegetarian)));
		System.out.println(menu.stream().collect(partitioningBy(Dish::isVegetarian,groupingBy(Dish::getType))));
		//System.out.println(menu.stream().collect(partitioningBy(Dish::isVegetarian,collectingAndThen(maxBy(Collectors.co), Optional::get))));
	}
}
