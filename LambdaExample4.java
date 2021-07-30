package com.javaguides.tutorial.lambda;

public class LambdaExample4 {

	public static void main(String[] args) {
		
		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("execute run method..."); }
		 * }; Thread thread = new Thread(runnable); thread.start();
		 */
		
		Runnable runnable = () -> System.out.println("Executing run method using lambda...");
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
