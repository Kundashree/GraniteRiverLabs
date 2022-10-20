package test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestUnModifiableCollection {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("upasana");
		list.add("Rahul");
		list.add("Rohit");
		
		System.out.println("initial list ");
		System.out.println(list);
		
		Collection<String> umlist = Collections.unmodifiableCollection(list);
		try {
			umlist.add("vivek");
		}catch (UnsupportedOperationException e) {
			System.out.println("this is unmutable, we cannot add new member");
		}
	}
}
