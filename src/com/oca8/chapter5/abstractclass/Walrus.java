package com.oca8.chapter5.abstractclass;


public class Walrus extends Animal { // DOES NOT COMPILE since it doesnot ovveride the abstract class.
}

class Flamingo extends Bird {
	public String getName() {
		return "Flamingo";
}
}