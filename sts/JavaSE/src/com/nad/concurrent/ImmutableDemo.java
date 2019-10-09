package com.nad.concurrent;

import java.lang.reflect.Field;

public class ImmutableDemo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String nadeem="prachi";
		String prachi="prachi";
		String nad=new String(nadeem);
		Field[] field=String.class.getDeclaredFields();
		for (Field field2 : field) {
			field2.setAccessible(true);
			System.out.println(field2.get("value"));
		}
	}
}
