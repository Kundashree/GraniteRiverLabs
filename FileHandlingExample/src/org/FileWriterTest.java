package org;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
	
		try {
			FileWriter fw = new FileWriter("c:\\temp\\kunda.txt");
			String content = "This is new content in my file";
			fw.write(content);
			fw.flush();
			System.out.println("file was written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
