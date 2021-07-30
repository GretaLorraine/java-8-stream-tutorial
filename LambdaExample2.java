package com.javaguides.tutorial.lambda;


interface Printable {
	void print(String message);
}

public class LambdaExample2 {

	public static void main(String[] args) {
		
		/*
		 * Printable printable = new Printable() {
		 * 
		 * @Override public void print(String message) { System.out.println(message); }
		 * }; printable.print("Lambda example with single parameter using anonymous class...");
		 */
		
		Printable printable = (message) -> System.out.println(message);
		printable.print("Lambda example with single parameter using expression...");

	}

}
