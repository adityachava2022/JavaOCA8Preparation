package com.oca8.tests.chapter3;

public class Chapter3RQ5 {

	public static void main(String[] args) {
		// '==' compares the object types , .equals() accepts an array.
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		if (s1 == s2)	//Incompatible operand types String and StringBuilder
			System.out.print("1");
		if (s1.equals(s2))
			System.out.print("2");
	}

}
