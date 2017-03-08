package com.oca8.chapter6.runtimeexceptions;

public class NumberFormatExceptionExample
{
	public static void main(String args[])
	{
		// Output : java.lang.NumberFormatException: For input String "abc"
		int a = Integer.parseInt("abc");
	}
}
