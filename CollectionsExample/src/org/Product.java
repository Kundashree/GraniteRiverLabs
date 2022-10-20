package org;

public class Product {
	String name;
	String brand;
	int price;
	int qty;
	
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
