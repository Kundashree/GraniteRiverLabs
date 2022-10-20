package domain;

import java.util.ArrayList;
import java.util.Collections;

import com.Product;

public class TestComaparator {

	public static void main(String[] args) {
		Item p1 = new Item("mobile","samsung",45000,2);
		Item p2 = new Item("tv","apple",100000,1);
		Item p3 = new Item("bluetooth","boat",1000,10);
		Item p4 = new Item("camera","nikon",50000,3);
		
		ArrayList<Item> itemList = new ArrayList();
		itemList.add(p1);
		itemList.add(p2);
		itemList.add(p3);
		itemList.add(p4);
		
		NameComparator objName = new NameComparator();
		Collections.sort(itemList, objName);
		System.out.println("sorting based on the name");
		for(Item p:itemList) {
			System.out.println(p);
		}
		
		PriceComparator objPrice = new PriceComparator();
		Collections.sort(itemList, objPrice);
		System.out.println("sorting based on the price");
		for(Item p:itemList) {
			System.out.println(p);
		}

	}

}
