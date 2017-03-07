package com.oca8.chapter6;

public class TrickyExceptionExample {
	public static String exceptions() {
	 String result = "";
	 String v = null;
	 try {
		 try {
			 result += "before";
			 v.length();
			 result += "after";
		 } catch (NullPointerException e) {
			 result += "catch";
			 throw new RuntimeException();
		 } finally {
			 result += "finally";
			 throw new Exception();
		 }
	 } catch (Exception e) {
		 System.out.println(e.toString());
		 result += "done";
	 }
	 return result;
	}
	
	public static void main(String args[])
	{
		System.out.println(exceptions());
	}
}
