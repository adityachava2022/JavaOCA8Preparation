package com.oca8.chapter4;

import java.util.ArrayList;

public class StaticFinalTrickyExample 
{
	public static final int i = 5;
	public static final ArrayList<String> al = new ArrayList<>();
	
	public static void main(String args[])
	{
		i = 10; // won't compile since it is static final
		al.add("a"); // it compiles as the same object
		al = new ArrayList<>(); // won't compile since it is static final and we are trying to add new object
	}
}
