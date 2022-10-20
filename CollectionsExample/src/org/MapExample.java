package org;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> automobile = new HashMap();
		automobile.put("aaa" , "car");
		automobile.put("bbb" , "bike");
		automobile.put("ccc" , "truck");
		automobile.put("ddd" , "scooter");
		automobile.put("ddd" , "bus");
		automobile.put("aaa" , "i20");
		automobile.remove("ddd");
		
		Map<String, String> map1 = Collections.synchronizedMap(automobile);
		
		//for(String m:names)
		for(Entry x:automobile.entrySet())
		{
			System.out.println(x.getKey()+ "----" + x.getValue());
		}
	}

}
