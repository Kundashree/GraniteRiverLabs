package org;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPath {

	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\kuna\\28-March\\JavaClassWork\\assignment\\Spoorthi\\MyFirstJavaApp\\src\\org\\Hello.java");
		System.out.println("Absolute path "+path.isAbsolute());
		System.out.println("file name "+path.getFileName());
		System.out.println("Root " +path.getRoot());
		System.out.println("name count "+path.getNameCount());
		System.out.println("sub path "+path.subpath(0, 4));

	}

}
