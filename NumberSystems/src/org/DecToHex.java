package org;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		
		 int num, counter = 0;
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter any integer number: ");
		    num = sc.nextInt();
		    int num2 = num;

		    /*to store maximum 32 digits of a number*/
		    String hexVal = "";
		    int dig; // to store digits
		    while (num > 0) {
		      dig = num % 16;
		      switch (dig) {
		      case 15:
		        hexVal += "F";
		        break;
		      case 14:
		        hexVal += "E";
		        break;
		      case 13:
		        hexVal += "D";
		        break;
		      case 12:
		        hexVal += "C";
		        break;
		      case 11:
		        hexVal += "B";
		        break;
		      case 10:
		        hexVal += "A";
		        break;
		      default:
		        hexVal += Integer.toString(dig);
		      }
		      num = num / 16;
		    }

		    for (counter = hexVal.length() - 1; counter >= 0; counter--)
		      System.out.print(hexVal.charAt(counter));
		    
		    System.out.println();
		    System.out.println("using inbuilt function");
		    String hexVal2 = "";
		    hexVal2 = Integer.toHexString(num2);
		    System.out.println("Hexadecimal Number is: " + hexVal2);

	}

}
