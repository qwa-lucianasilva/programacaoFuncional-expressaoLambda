package application;

import java.util.ArrayList;
import java.util.List;

import entities.Products;

public class Program {
	
	public static int compareProducts(Products p1, Products p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("TV", 900.00));
		list.add(new Products("Notebook", 1200.00));
		list.add(new Products("Tablet", 450.00));
		
		list.sort(Program::compareProducts);
		list.forEach(System.out::println);
	
	}
}