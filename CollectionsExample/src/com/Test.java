package com;

import java.util.Set;
import java.util.TreeSet;


public class Test {

	public static void main(String[] args) {
		Product p1 = new Product("mobile","samsung",45000,2);
		Product p2 = new Product("TV","apple",100000,1);
		Product p3 = new Product("bluetooth","boat",1000,10);
		Product p4 = new Product("camera","nikon",50000,3);
		
		Set<Product> prodset = new TreeSet<Product>();
		prodset.add(p1);
		prodset.add(p2);
		prodset.add(p3);
		prodset.add(p4);
		
		//collections.sort(prodset); no need
		System.out.println(prodset);

	}

}
