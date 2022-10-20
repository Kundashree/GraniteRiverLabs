package org;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {


		List<DataSet> attribute1 = new ArrayList<>();
		
		UserInput ui = new UserInput();
		ui.method1(attribute1);
		
		Measure m = new Measure();
		m.method1(attribute1);
		
		ShowResults sr = new ShowResults();
		sr.csvfileWriter(attribute1);

	}

}
