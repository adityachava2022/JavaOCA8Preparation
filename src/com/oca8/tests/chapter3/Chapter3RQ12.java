package com.oca8.tests.chapter3;

public class Chapter3RQ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8); // delete will remove the substring(fromIndex,endindex-1) 
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);
	}

}
