package entities;

public class Products {

	private String name;
	private Double price;
	
	public Products() {
	}

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Products p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonstaticPriceUpdate() {
		price = price * 1.1;
	}
	
	public static String staticUpperCaseName(Products p) {
		return p.getName().toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}