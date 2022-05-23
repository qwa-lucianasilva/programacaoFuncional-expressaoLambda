package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
	
		list.forEach(Products::nonstaticPriceUpdate);
		
		list.forEach(System.out::println);
	}
}