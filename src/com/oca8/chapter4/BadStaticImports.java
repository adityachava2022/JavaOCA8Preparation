package com.oca8.chapter4;

import static java.util.Arrays; // DOES NOT COMPILE static imports should be only for static members of the class
import static java.util.Arrays.asList;
static import java.util.Arrays.*; // DOES NOT COMPILE it should import static

public class BadStaticImports {

	public static void main(String[] args)
	{
		Arrays.asList("one"); // DOES NOT COMPILE We imported the asList method. However,
		//we did not import the Arrays class anywhere. This makes it okay to write asList("one");
		//but not Arrays.asList("one");.
	}

}
