package com.oca8.tests;

public class Chapter2RQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 5;
		byte y = 10;
		//int because byte will be casted to int 
		int iz = x + y;
		// long because byte wiil be casted to int and by default long is considered as int upto certain value.
		long lz = x + y; 
		//double because int will be converted to larger value double and integer value will be
		//converted to floating value.
		double dz = x + y;
		//float as well because int will be converted to floating value.
		//note that here it is only a single int value but not decimal value to throw error.
		float fz = x + y ;
		
		byte b = (byte)(x + y);
		short s = (short)(x+y);
 	}

}
