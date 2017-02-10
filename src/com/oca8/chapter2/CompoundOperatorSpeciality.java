package com.oca8.chapter2;

public class CompoundOperatorSpeciality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long x = 10;
		int y = 5;
		y = y * x; 
		// DOES NOT COMPILE because y is converted to long and multiplied but the result is long 
		//assigned to int.
		
		// but with the compound assignment , we can overcome this error.
		
		long x1 = 10;
		int y1 = 5;
		y1 *=  x; // COMPILES
	}

}
