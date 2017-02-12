package com.oca8.tests.chapter3;

public class Chapter3RQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));	// substring will return string(fromIndex,endindex-1)
		System.out.println(numbers.substring(7, 7)); // substring of same number will not return anythinh
		System.out.println(numbers.substring(7)); //substring of fromindex will return string from fromindex till the end.
	}

}
