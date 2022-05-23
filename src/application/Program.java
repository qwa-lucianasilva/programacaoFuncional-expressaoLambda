package application;

import java.util.ArrayList;
import java.util.List;

import entities.Products;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));
		
		list.removeIf(new ProductPredicate());
		
		for (Products p : list) {
			System.out.println(p);
		}
	}
}