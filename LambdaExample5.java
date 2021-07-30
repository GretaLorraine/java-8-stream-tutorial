package com.javaguides.tutorial.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample5 {

	public static void main(String[] args) {
		
		List<String> progLangs = new ArrayList<String>();
		progLangs.add("Java");
		progLangs.add("Python");
		progLangs.add("C++");
		
		progLangs.forEach(element -> System.out.println(element));

	}

}
