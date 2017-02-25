package com.oca8.chapter5.abstractclass;

/* Notice that when we defi ne a concrete class as the “fi rst” nonabstract subclass, we
include the possibility that another nonabstract class may extend an existing nonabstract
class. The key point is that the fi rst class to extend the nonabstract class must implement all
inherited abstract methods. For example, the following variation will also not compile:*/

public class Bird extends Animal { // DOES NOT COMPILE as they dont ovveride abstract method.
}

class Flamingo extends Bird {
	public String getName() {
		return "Flamingo";
	}
}