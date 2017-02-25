package com.oca8.chapter5.constructorrules;

class Primate {
	public Primate() {
		// super(); //is inserted by java if you don't insert one. in this case it is Object class.
	System.out.println("Primate");
	}
}
class Ape extends Primate {
	public Ape() {
		// super(); //is inserted by java if you don't insert one.
	System.out.println("Ape");
	}
}
public class Chimpanzee extends Ape {
	//default no-arg constructor with call to super is inserted by java.
	public static void main(String[] args) {
	new Chimpanzee();
	}
}
