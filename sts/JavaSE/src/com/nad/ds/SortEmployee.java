package com.nad.ds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortEmployee {

	public static List<Employee> sortEmployees(List<Employee> emps){
		
	return	emps.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getSal()==o2.getSal())
					return
							o1.getName().compareTo(o2.getName());
				else
				return o1.getSal()-o2.getSal();
			}
		}).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(new Employee("nad", 50));
		emps.add(new Employee("abc", 50));
		emps.add(new Employee("xyz", 100));
		emps=sortEmployees(emps);
		System.out.println(emps.toString());
	}
}
