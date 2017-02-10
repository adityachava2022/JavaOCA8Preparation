package com.oca8.chapter3;

public class StringMutability {

	public static void main(String[] args) {
// it will print '12'
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);
	}

}
