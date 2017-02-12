package com.oca8.tests.chapter3;

import java.util.Arrays;
import java.util.List;

public class Chapter3RQ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar1[] = {"a","b","c"};
		String ar2[] = {"a","b","c"};
		List<String> al1= Arrays.asList(ar1);
		List<String> al2= Arrays.asList(ar2);
		System.out.println(ar1.equals(ar2)); // false
		System.out.println(ar1 == ar2); // false , this is not like string pool where the same literals are reused.
		System.out.println(al1.equals(al2)); // true , since it implements equals 
		System.out.println(al1 == al2); // false, they are created at different addresses
	}

}
