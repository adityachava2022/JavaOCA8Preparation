package com.oca8.tests.chapter3;

public class Chapter3RQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "Hello";
		 String t = new String(s);
		 if ("Hello".equals(s)) System.out.println("one");
		 if (t == s) System.out.println("two");
		 if (t.equals(s)) System.out.println("three");
		 if ("Hello" == s) System.out.println("four");
		 if ("Hello" == t) System.out.println("five");
	}

}
