package com.oca8.chapter6.runtimeexceptions;

public class ArrayIndexOutOfBoundsExceptionExample
{
	public static void main(String[] args)
	{
		// negative index example
		// output : java.lang.ArrayIndexOutOfBoundsException: -1
		int[] countsOfMoose = new int[3];
		System.out.println(countsOfMoose[-1]);
		
		// example2 : more than length example
		// output : java.lang.ArrayIndexOutOfBoundsException: 3
		int total = 0;
		int[] countsOfMoose2 = new int[3];
		for (int i = 0; i <= countsOfMoose2.length; i++)
		total += countsOfMoose2[i];
	}
}
