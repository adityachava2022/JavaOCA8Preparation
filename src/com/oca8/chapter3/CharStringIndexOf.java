package com.oca8.chapter3;

public class CharStringIndexOf {

	public static void main(String[] args) {
		/*
		int indexOf(char ch)
		int indexOf(char ch, index fromIndex)
		int indexOf(String str)
		int indexOf(String str, index fromIndex)
		The following code shows how to use indexOf(): */
		String string = "animals";
		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al")); // 4
		System.out.println(string.indexOf('a', 4)); // 4
		System.out.println(string.indexOf("al", 5)); // -1
		
	}

}
