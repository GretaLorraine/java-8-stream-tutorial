package com.javaguides.tutorial.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		
		// GETTING LIST OF PRODUCTS OVER 25000 WITHOUT STREAM API:
		List<Product> list = new ArrayList<>();
		for(Product product : getProducts()) {
			if(product.getPrice() > 25000f) {
				list.add(product);
			}
		}
		for(Product product : list) {
			System.out.println(product);
		}
		
		// USING STREAM API TO GET A LIST OF PRODUCTS OVER 25000:
		List<Product> list2 = getProducts().stream().filter((product) -> product.getPrice() > 25000f).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		// OR WITH EVEN LESS CODE
//		getProducts().stream().filter((product) -> product.getPrice() > 25000f).forEach(System.out::println);

	}
	
	private static List<Product> getProducts() {
		List<Product> listOfProducts = new ArrayList<Product>();
		listOfProducts.add(new Product(1, "HP", 25000f));
		listOfProducts.add(new Product(2, "Dell", 30000f));
		listOfProducts.add(new Product(3, "Lenovo", 28000f));
		listOfProducts.add(new Product(4, "Sony", 28000f));
		listOfProducts.add(new Product(5, "Apple", 90000f));
		return listOfProducts;
	}

}

class Product {
	
	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product id: " + id + " \nName: " + name + " \nPrice: " + price;
	}
	
	
	
}
