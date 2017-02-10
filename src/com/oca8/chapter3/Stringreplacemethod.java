package com.oca8.chapter3;

public class Stringreplacemethod {

	public static void main(String[] args) {
		/*
		A CharSequence is a general way of representing several classes, including String and
		StringBuilder
		
		String replace(char oldChar, char newChar)
		String replace(CharSequence oldChar, CharSequence newChar)
		*/
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		
	}

}
