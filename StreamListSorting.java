package com.javaguides.tutorial.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("strawberry");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("dragonfruit");

		// Three ways to sort in Ascending order:
		fruits.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("\n");
		fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);
		System.out.println("\n");
		fruits.stream().sorted().forEach(System.out::println);
		System.out.println("\n");
//		Remember, can also create a variable and print separately:
//		List<String> sortedList = fruits.stream().sorted().collect(Collectors.toList());
//		System.out.println(sortedList);

		// Descending order:
		fruits.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("\n");
		fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::println);
		System.out.println("\n");
		
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Fred", 25, 50000));
		employees.add(new Employee(20, "Daphne", 23, 49000));
		employees.add(new Employee(30, "Velma", 26, 60000));
		employees.add(new Employee(40, "Shaggy", 21, 45000));
		
		// SORT EMPLOYEE BY SALARY:
		employees.stream().sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
		}).forEach(System.out::println); //ascending
		employees.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println); // ascending using lambda expressions:
		System.out.println("\n");
		employees.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println); // descending
		System.out.println("\n");
		employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).forEach(System.out::println); // ascending
		System.out.println("\n");
		
		// SORT EMPLOYEE BY AGE:
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println); // ascending
		System.out.println("\n");
		employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).forEach(System.out::println); // descending
		System.out.println("\n");
		
		// SORT EMPLOYEE BY NAME:
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println); // ascending
		System.out.println("\n");
		employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println); //descending

	}

}
