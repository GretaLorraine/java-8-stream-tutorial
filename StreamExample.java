package com.javaguides.tutorial.streamapi;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample {
	
	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		// count() method : counts number of elements in stream
		System.out.println(stream.count());
		
		//min() method : element with minimum value
		Integer minInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Min => " + minInteger);
		
		// max() method : element with maximum value
		Integer maxInteger = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max => " + maxInteger);
		
	}

}
