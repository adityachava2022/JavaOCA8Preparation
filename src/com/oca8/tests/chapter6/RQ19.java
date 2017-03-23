package com.oca8.tests.chapter6;

import java.io.IOException;

public class RQ19 {
	public static void main(String[] args)
	{
		try 
		{
			System.out.println("work real hard");
		} catch (IOException e) {
			/* The method called inside the try block doesn’t declare an IOException to be thrown.
			 * The compiler realizes that IOException would be an unreachable catch block */
		} catch (Throwable e) {
		}
	}
}
