package org;

import java.util.Scanner;

public class AcceptInput {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = scn.next();
		System.out.println("enter your address");
		String address = scn.next();
		System.out.println("enter your age");
		int age = scn.nextInt();
		System.out.println("enter the time");
		double time = scn.nextDouble();
		
		System.out.println("Hello am " + name + " from " + address + " and am "+ age +" years old " + " now the time is " + time);
		

	}

}
