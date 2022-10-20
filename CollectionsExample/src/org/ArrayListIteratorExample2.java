package org;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample2 {

	public static void main(String[] args) {
		Product pr1 = new Product("mobile","samsung",45000,2);
		Product pr2 = new Product("TV","apple",100000,1);
		
		ArrayList<Product> prod = new ArrayList();
		prod.add(pr1);
		prod.add(pr2);
		
		System.out.println(prod);
		
		Iterator<Product> itr = prod.iterator();
		while(itr.hasNext()) 
		{
			Product p = itr.next();
			System.out.println(p.name);
			System.out.println(p.brand);
			System.out.println(p.price);
			System.out.println(p.qty);
			System.out.println("***********************");
//			System.out.println(itr.next());
//			System.out.println(itr.next().name);
//			System.out.println(itr.next().brand); //wrong logic
		}
		
	}

}
