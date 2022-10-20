package org;

public class BinToDec {

	public static void main(String[] args) {
		long num = 110110111;

		int dec = Integer.parseInt("1110", 2);
	    System.out.println( " using Built in function = " + dec );
	    
	    int decimal = convertBinaryToDecimal(num);

	    System.out.println("Binary to Decimal");
	    System.out.println(num + " = " + decimal);
	  }

	  public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;

	}

}
