package com.oca8.chapter4;

public class StaticInitialization {
	private static int one;
	private static final int two;
	private static final int three = 3;
	private static final int four;	//does not compile since it is not initialized.
	private int nonstaticv = 23;
	static {
	 one = 1;
	 two = 2;
	 three = 3; 	// does not compile since already initialized.
	 two = 4; 		// does not compile since already initialized.
	// nonstaticv = 23;
	 }
	
}
