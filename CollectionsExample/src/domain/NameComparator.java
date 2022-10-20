package domain;

import java.util.Comparator;

public class NameComparator implements Comparator{
	
	public int compare(Object obj1, Object obj2)
	{
		Item p1 = (Item)obj1; //casting, making general obj as item
		Item p2 = (Item)obj2; 	
		return p1.getName().compareTo(p2.getName());
	}

}
