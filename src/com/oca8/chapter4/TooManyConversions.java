package com.oca8.chapter4;

public class TooManyConversions {
//	* note that java will only do one conversion.
		public static void play(Long l) { }
		public static void play(Long... l) { }
		public static void main(String[] args) 
		{
			play(4); // DOES NOT COMPILE  because it has to convert from int to long to Long
			play(4L); // calls the Long version
		}
}
