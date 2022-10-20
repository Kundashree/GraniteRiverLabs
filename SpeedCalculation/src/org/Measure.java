package org;

import java.util.ArrayList;
import java.util.List;

public class Measure {

	
	public List<DataSet> method1(List<DataSet> attribute1 ){
		
		
		for(DataSet ds : attribute1) {
			
			ds.setSpeed(ds.getDistance()/ds.getTime());
			
		}
			
		return attribute1;
		
	}
}
