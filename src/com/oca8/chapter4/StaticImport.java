package com.oca8.chapter4;

import java.util.List;
import static java.util.Arrays.asList;
//import static java.util.Arrays;
public class StaticImport {

	public static void main(String[] args)
	{
		List<String> list = asList("a","b");
		System.out.println(list);
		Arrays.asList("1","2");
	}

}
