package com.oca8.chapter6.runtimeexceptions;

public class IllegalArgumentExceptionExample {

	public static void main(String[] args)
	{
		// output : java.lang.IllegalArgumentException: # eggs must not be negative
		setNumberEggs(-2);
	}

	public static void setNumberEggs(int numberEggs)
	{
		if (numberEggs < 0)
			throw new IllegalArgumentException("# eggs must not be negative");
		else
			System.out.println(numberEggs);
	}
}
