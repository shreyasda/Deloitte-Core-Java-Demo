package com.deloitte.java.day3.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.addAll(Arrays.asList(new Employee(101,"A",1020), new Employee(102,"B",1045),
				new Employee(103,"C",1096), new Employee(104,"D",1065)));
		
		System.out.println("List of all employees: ");
		empList.forEach(e -> System.out.println(e.name));
		
		System.out.println("Employees with salary more than 1050");
		empList.forEach(e -> {
			if(e.salary > 1050) {
				System.out.println(e.name + " " + e.salary);
			}
		});
		 
		Stream<Employee> empStream = empList.stream();
		Predicate<Employee> predicate = e -> e.salary > 1050;
		Stream<Employee> empTemp = empStream.filter(predicate);
		List<Employee> empWithSalaryFilter = empTemp.toList();
		empWithSalaryFilter.forEach(e -> System.out.println(e.name));
		empList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).stream().forEach(e -> System.out.println(e.name));

		System.out.println("First two employees using Stream API:");
		empList.stream().limit(2).forEach(e -> System.out.println(e.name));
		
		System.out.println("Except first two employees using Stream API:");
		empList.stream().skip(2).forEach(e -> System.out.println(e.name));
	}
}
