package com.oca8.tests.chapter3;

public class Chapter3RQ11 {

	public static void main(String[] args) {
		// java.lang.StringIndexOutOfBoundsException: String index out of range: -1 from letter.substring(6,5)
		int total = 0;
		StringBuilder letters = new StringBuilder("abcdefg");
		total += letters.substring(1, 2).length();
		total += letters.substring(6, 6).length();
		total += letters.substring(6, 5).length();
		System.out.println(total);
	}

}
