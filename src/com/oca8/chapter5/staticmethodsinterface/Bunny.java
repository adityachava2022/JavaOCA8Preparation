package com.oca8.chapter5.staticmethodsinterface;

public class Bunny implements Hop {
	public void printDetails()
	{
		//System.out.println(" jump details : "+getJumpHeight()); // doesnot compile since static methods should not
																 // be called directly.
		System.out.println(" jump details : "+Hop.getJumpHeight());
	}
}
