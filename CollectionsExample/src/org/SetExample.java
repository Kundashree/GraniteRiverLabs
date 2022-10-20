package org;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> fruits = new TreeSet();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("pomogranate");
		System.out.println(fruits);
		

	}

}
