package com.oca8.chapter5.inheritingmethods;



public class Snake extends Reptile {
	/*throws an exception InsufficientDataException
in the parent class but doesn’t throw an exception in the child class. This does not violate the
third rule of overriding methods, though, as no new exception is defined. */
	protected boolean hasLegs() {
		return false;
	}
	/*throws Exception in the parent class
and InsufficientDataException in the child class. This is also permitted, as
InsufficientDataException is a subclass of Exception by construction. */
	protected double getWeight() throws InsufficientDataException{  																	
		return 2;
	}
}
