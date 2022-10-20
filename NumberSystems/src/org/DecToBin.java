package org;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		int num, counter = 0;
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Enter any integer number: ");
	    num = sc.nextInt();
	    int num2 = num;

	    
	    int binaryVal[] = new int[32];

	    while (num > 0) {
	      binaryVal[counter++] = num % 2;
	      num = num / 2;
	    }

	    
	    for (int i = counter - 1; i >= 0; i--) {
	      System.out.print(binaryVal[i]);
	    }
	    System.out.println();
	    
	    System.out.println("using inbuilt function");
	    String str = Integer.toBinaryString(num2);
	    System.out.println("Binary number is : " + str);
	}

}
