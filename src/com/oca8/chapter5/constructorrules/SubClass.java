package com.oca8.chapter5.constructorrules;

public class SubClass extends SuperClass {
	public SubClass()
	{
		super();	// if we don't define this , then java will insert it.
		//super();	//doesn't compile as per rule 2
	}
}
