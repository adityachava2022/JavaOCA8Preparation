package com.oca8.tests.chapter3;

import java.util.Arrays;
import java.util.List;

public class Chapter3RQ24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Tom", "Dick", "Harry"};
		//List<String> list = names.asList();  // it should be Arrays.asList(names);
		List<String> list = Arrays.asList(names);
		list.set(0, "Sue");
		System.out.println(names[0]);
	}

}
