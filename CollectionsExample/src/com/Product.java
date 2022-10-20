package com;

public class Product implements Comparable<Product> {
	String name;
	String brand;
	int price;
	int qty;
	
	public int compareTo(Product p) {
		if(price == p.price)
			return 0;
		else if(price > p.price)
			return 1;
		else
			return -1;
	}
	
	public Product(String name, String brand, int price, int qty) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.qty = qty;
	}
	public Product() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
}
