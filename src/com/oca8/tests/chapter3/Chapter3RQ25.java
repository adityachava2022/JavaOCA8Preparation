package com.oca8.tests.chapter3;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Chapter3RQ25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		System.out.println(hex);  //[30, 3A, 8, FF]
		int x = Collections.binarySearch(hex, "8");  //collections.binarySearch  and even Arrays.binarySearch works
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F");
		System.out.println(x + " " + y + " " + z);
	}

}
