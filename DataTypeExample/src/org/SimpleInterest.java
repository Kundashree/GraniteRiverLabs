package org;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p t r");
		double principle = sc.nextDouble();
        double time =sc.nextDouble();
        double rate = sc.nextDouble();
        
        double si = (principle * time * rate) / 100;
        System.out.println(si);

	}

}
