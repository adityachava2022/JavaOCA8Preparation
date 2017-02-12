package com.oca8.tests.chapter3;

import java.util.Arrays;

public class Chapter3RQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] random = { 6, -4, 12, 0, -10 };
		int x = 5;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y);     // it will return index if present and -1 if not present. but the result has to be meaningful.
		//so the answer should be undefined.
	}

}
