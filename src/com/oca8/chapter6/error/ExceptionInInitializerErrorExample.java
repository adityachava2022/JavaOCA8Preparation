package com.oca8.chapter6.error;

public class ExceptionInInitializerErrorExample 
{
	// output : java.lang.ExceptionInInitializerError
	// Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
	static
	{
		int ar[] = new int[3];
		System.out.println(ar[-1]);
	}
	public static void main(String[] args) { }
}
