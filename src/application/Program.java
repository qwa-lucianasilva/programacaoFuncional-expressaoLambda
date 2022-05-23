package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Products;
import util.UpperCaseName;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}