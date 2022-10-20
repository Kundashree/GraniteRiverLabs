package org;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> juststring = new ArrayList<String>();
		juststring.add("upasana");
		juststring.add("Rahul");
		juststring.add("kunda");
		System.out.println(juststring);
		for(String x : juststring) {
			System.out.println(x);
		}
		//to traverse
		
		Iterator<String> itr = juststring.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Person p1 = new Person("upasana", 32, "Bengaluru");
		Person p2 = new Person("rahul", 23, "Mumbai");
		Person p3 = new Person("Kunda", 22, "Hassan");
		
		ArrayList<Person> justPerson = new ArrayList();
		justPerson.add(p1);
		justPerson.add(p2);
		justPerson.add(p3);
		
		Iterator<Person> itr1 = justPerson.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		

	}

}
