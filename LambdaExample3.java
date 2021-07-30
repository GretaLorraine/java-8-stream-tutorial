package com.javaguides.tutorial.lambda;


interface Addable {
	int add(int a, int b);
}

public class LambdaExample3 {

	public static void main(String[] args) {
		
		// Lambda example with multiple parameters
		/*
		 * Addable addable = new Addable() {
		 * 
		 * @Override public int add(int a, int b) { return (a + b); } };
		 * System.out.println(addable.add(10, 20));
		 */
		
		Addable addable = (a, b) ->  (a + b);
		System.out.println(addable.add(20, 30));
		
		// if multiple statements, should use a return keyword:
		Addable addable1 = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return (a + b);
		};
		System.out.println(addable1.add(20, 30));

	}

}
