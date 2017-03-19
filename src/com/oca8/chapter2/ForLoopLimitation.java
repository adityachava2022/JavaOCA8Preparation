package com.oca8.chapter2;

public class ForLoopLimitation {

	public static void main(String[] args) 
	{
		// Using Incompatible Data Types in the Initialization Block
		/* The variables in the initialization block must all be of the same type.*/
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) // DOES NOT COMPILE 
		{ 
			System.out.print(x + " ");
		}
	}

}
