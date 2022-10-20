package domain;

import java.util.Comparator;

public class PriceComparator implements Comparator {
	public int compare(Object obj1, Object obj2)
	{
		Item p1 = (Item)obj1; //casting, making general obj as item
		Item p2 = (Item)obj2; 	
		if(p1.getPrice() == p2.getPrice())
			return 0;
		else if(p1.getPrice() > p2.getPrice())
			return 1;
		else
			return -1;
	}
}
