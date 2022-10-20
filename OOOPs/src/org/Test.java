package org;

public class Test {

	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "upasana";
		p1.age = 32;
		p1.address = "Bangalore";
		System.out.println(p1.name +" is " +p1.age + " and lives in "+p1.address);
		
		Person p2 = new Person();
		
		p2.name = "Kunda";
		p2.age = 22;
		p2.address = "Tumkur";
		System.out.println(p2.name +" is " +p2.age + " and lives in "+p2.address);
		
		
		Student s1 = new Student();
		s1.rollno = 23;
		System.out.println(s1.rollno);
				
	}
}
