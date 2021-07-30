package com.javaguides.tutorial.lambda;


interface Drawable {
	void draw();
}

class DrawableImpl implements Drawable {
	@Override
	public void draw() {
		System.out.println("drawing...");
	}
}

public class LambdaExample1 {

	public static void main(String[] args) {
//		Drawable drawable = new DrawableImpl();
//		drawable.draw();
		
		//Anonymous class is a class that doesn't have any name
		// this is the Anonymous implementation using the Anonymous class
		/*
		 * Drawable drawable = new Drawable() { // <= declaration and instantiation
		 * happen at same time here
		 * 
		 * @Override public void draw() {
		 * System.out.println("drawing using anonymous..."); } }; drawable.draw();
		 */
		
		// Lambda to implement the interface!!!
		Drawable drawable = () -> System.out.println("Drawing using Lambda...");
		drawable.draw();
		
	}
}
