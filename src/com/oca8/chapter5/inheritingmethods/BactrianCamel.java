package com.oca8.chapter5.inheritingmethods;

class Camel {
	protected String getNumberOfHumps() {
		return "Undefined";
	}
}
public class BactrianCamel extends Camel {
	private int getNumberOfHumps() { // DOES NOT COMPILE because of rule 4, the return type must be same or subclass
									 // of that in parent class and also the it should be more accessible to the parent
									 // class. but it is 'protected' in the parent and 'private in child class 
		return 2;
	}
}
