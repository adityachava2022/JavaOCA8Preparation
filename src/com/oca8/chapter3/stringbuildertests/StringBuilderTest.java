package com.oca8.chapter3.stringbuildertests;

public class StringBuilderTest {

	public static void main(String[] args) 
	{
		/* StringBuilder vs String 
		   StringBuilder changes its own state and returns a reference to itself
		   */
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		System.out.println("sb = "+sb+" same = "+same+" both are equal :"+(sb == same));
		
		String s = new String("start");
		s += "+middle";
		String ss = s + "+end";
		System.out.println("s = "+s+" ss = "+ss+" both are not equal :"+(s == ss));
		
		/* 
		  StringBuilder Constructors
		  StringBuilder()					Creates an empty string builder with a capacity of 16 (16 empty elements).
          StringBuilder(CharSequence cs)	Constructs a string builder containing the same characters as the specified CharSequence, plus an extra 16 empty elements trailing the CharSequence.
		  StringBuilder(int initCapacity)	Creates an empty string builder with the specified initial capacity.
          StringBuilder(String s)			Creates a string builder whose value is initialized by the specified string, plus an extra 16 empty elements trailing the string.
		 */
		
		
		
	}

}