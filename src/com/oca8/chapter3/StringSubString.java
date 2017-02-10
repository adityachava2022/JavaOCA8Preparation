package com.oca8.chapter3;

public class StringSubString {

	public static void main(String[] args) {
		/*
		int substring(int beginIndex)
		int substring(int beginIndex, int endIndex)
		
		The method returns the
		string starting from the requested index. If an end index is requested, it stops right before
		that index. Otherwise, it goes to the end of the strin
		*/
		String string = "animals";
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals
		
		
		System.out.println(string.substring(3, 3)); // empty string
		System.out.println(string.substring(3, 2)); // throws exception
		System.out.println(string.substring(3, 8)); // throws exception
	}

}
