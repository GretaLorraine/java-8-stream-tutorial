package com.javaguides.tutorial.streamapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		
		// 1. Create a stream.
		Stream<String> stream = Stream.of("a", "b", "c");
		stream.forEach(System.out::println);
		
		// 2. Create a stream object from Collection.
		Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out::println);
		
		// 3. Create a stream object from List.
		List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
		Stream<String> stream3 = list.stream();
		stream3.forEach(System.out::println);
		
		// 4. Create a stream object from Set.
		Set<String> set = new HashSet<>(list);
		Stream<String> stream4 = set.stream();
		stream4.forEach(System.out::println);
		
		// 5. Create a stream object from Array.
		String[] strArray = {"a", "b", "c"};
		Stream<String> stream5 = Arrays.stream(strArray);
		stream5.forEach(System.out::println);

	}

}
