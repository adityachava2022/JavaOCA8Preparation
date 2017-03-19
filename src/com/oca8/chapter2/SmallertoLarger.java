package com.oca8.chapter2;

public class SmallertoLarger {

	public static void main(String[] args) {
		
		int x = 1.0; // DOES NOT COMPILE Type mismatch: cannot convert from double to int
		short y = 1921222; // DOES NOT COMPILE Type mismatch: cannot convert from int to short
		int z = 9f; // DOES NOT COMPILE Type mismatch: cannot convert from float to int
		long t = 192301398193810323; // DOES NOT COMPILE The literal 192301398193810323 of type int is out of range 
		
		
	
		int x1 = (int)1.0; // DOES NOT COMPILE
		short y1 = (short)1921222; // DOES NOT COMPILE
		int z1 = (int)9f; // DOES NOT COMPILE
		long t1 = 192301398193810323L; // DOES NOT COMPILE
	}

}
