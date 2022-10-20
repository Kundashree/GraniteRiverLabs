package org;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class ShowResults {
	
	public void csvfileWriter(List<DataSet> attribute1){
		
		try {
			CSVWriter writer = new CSVWriter(new FileWriter("c://temp//output.csv"));
				
			for(DataSet ds: attribute1) {
				
				String[] s = {"Distance: " + Double.toString(ds.getDistance()), "Time: "+ Double.toString(ds.getTime()), "Speed: " + Double.toString(ds.getSpeed())  };
				writer.writeNext(s);
				
			}
			
			writer.flush();
			System.out.println("data entered");
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
