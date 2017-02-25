package com.oca8.tests.chapter5.rq4;

public class Beaver extends Rodent {
	public Number chew() throws RuntimeException {   // does not compile 
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
}