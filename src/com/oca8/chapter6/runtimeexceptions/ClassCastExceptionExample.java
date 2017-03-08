package com.oca8.chapter6.runtimeexceptions;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// Example 1 : string to integer cast , does not compile
		String type = "moose";
		Integer number = (Integer) type; // DOES NOT COMPILE
		
		//Example 2 : 
		// output : java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		String st = "type";
		Object ob = st;
		Integer in = (Integer)ob;
	}

}
