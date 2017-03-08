package com.oca8.chapter6.runtimeexceptions;

public class NullPointerExceptionExample {

	public static void main(String[] args) 
	{
		//output : java.lang.NullPointerException
		String arg = null;
		System.out.println(arg.length());

	}

}
