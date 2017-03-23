package com.oca8.chapter4;
/* static members should call only static members*/
public class Static 
{
		
		private String name = "Static class";
		public static void first() { }
		public static void second() { }
		public void third() { System.out.println(name); }
		public static void main(String args[])
		{
			first();
			second();
			Static s = new Static();
			third(); // DOES NOT COMPILE
		}
}
