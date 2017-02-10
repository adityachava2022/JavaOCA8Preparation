package com.oca8.chapter2;

public class PreincrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

}
