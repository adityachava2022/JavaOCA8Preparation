package com.oca8.chapter3.arrays;

import java.util.Arrays;

public class ArrayType {
	public static void main(String args[])
	{
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // DOES NOT COMPILE because string cannot accept a StringBuilder reference.
		
		
		/*From the point of view of the compiler, this is just
		fine. A StringBuilder object can clearly go in an Object[]. The problem is that we don’t
		actually have an Object[]. We have a String[] referred to from an Object[] variable. At
		runtime, the code throws an ArrayStoreException */
		objects[0] = new StringBuilder(); // careful!
		System.out.println(objects[0]); // it will throw ArrayStoreException
		
		/* arrays class is present in java.util */
		/* This code outputs 10 100 9. The problem is 
		   that String sorts in alphabetic order, and
		   1 sorts before 9. (Numbers sort before
		   letters and upper case sorts before lower case
		   Order: numbers , letters (Upper case, lower case)
		   */
		String[] stringsarray = { "10", "9", "100" };
		Arrays.sort(stringsarray);
		for (String st : stringsarray)
		System.out.print(st + " ");
	} 
}
