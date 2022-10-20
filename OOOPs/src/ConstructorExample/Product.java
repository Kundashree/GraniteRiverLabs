package ConstructorExample;

public class Product {
	
	String name;
	String brand;
	int price;
	int qty;
	
	public Product() {
		System.out.println("Person constructor");
	}
	
	public Product(String name, String brand, int price, int qty) {
		this.name = name;
		this.brand= brand;
		if (price <= 0) {
			System.out.println("price cannot be zero");
		}
		else {
		this.price = price;
		}
		this.qty = qty;
	}
	
	
public Product(String name, String brand) {
	this.name = name;
	this.brand = brand;
}
	




}
