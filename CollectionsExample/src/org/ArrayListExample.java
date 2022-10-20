package org;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		Person p1 = new Person("upasana", 32, "Bengaluru");
		System.out.println(p1.toString());
		Person p2 = new Person("rahul", 23, "Mumbai");
		Person p3 = new Person("Kunda", 22, "Hassan");
		
		ArrayList any = new ArrayList();
		any.add("upasana");
		any.add(12345);
		any.add(true);
		any.add(p1);
		any.add(p2);
		System.out.println(any);
		
		         //generic
		ArrayList<String> juststring = new ArrayList<String>();
		juststring.add("upasana");
		juststring.add("Rahul");
		juststring.add("kunda");
		System.out.println(juststring);
		
		ArrayList<Person> justPerson = new ArrayList();
		justPerson.add(p1);
		justPerson.add(p2);
		justPerson.add(p3);
		System.out.println(justPerson);
		

	}

}
