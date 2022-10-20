package ConstructorExample;

public class TestProduct {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.name = "mobile";
		p1.brand = "oneplus";
		p1.price = 20000;
		p1.qty=12;
		
		Product p2 = new Product("Tripod", "digitech",0,5 );
		System.out.println(p2.name);
		
		Product p3 = new Product("nailpolish", "lakme");
		System.out.println(p3.price);
		
		
		

		

	}

}
