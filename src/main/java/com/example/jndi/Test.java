package com.example.jndi;

public class Test {

	public static void main(String[] args) {

		int x = 0b10101000;
//		int result = x | (x-1);
		int result = ~x & (x + 1);
		System.out.println(result);
		System.out.println( convertDecimalToBinary(result) );
	}

	public static Integer convertDecimalToBinary(Integer decimalNumber) {

	    if (decimalNumber == 0) {
	        return decimalNumber;
	    }

	    StringBuilder binaryNumber = new StringBuilder();
	    Integer quotient = decimalNumber;

	    while (quotient > 0) {
	        int remainder = quotient % 2;
	        binaryNumber.append(remainder);
	        quotient /= 2;
	    }

	    binaryNumber = binaryNumber.reverse();
	    return Integer.valueOf(binaryNumber.toString());
	}

}
