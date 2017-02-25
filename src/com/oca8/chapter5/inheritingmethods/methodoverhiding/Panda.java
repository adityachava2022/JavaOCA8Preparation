package com.oca8.chapter5.inheritingmethods.methodoverhiding;

class Bear {
	public static void eat() {
		System.out.println("Bear is eating");
	}
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
}

public class Panda extends Bear {
	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	public void sneeze() { // DOES NOT COMPILE bcoz no static keyword is there.
		System.out.println("Panda bear sneezes quietly");
	}
	public static void hibernate() { // DOES NOT COMPILE bcoz no static keyword is there in the parent.
		System.out.println("Panda bear is going to sleep");
	}
	public static void main(String[] args) {
		Panda.eat();  // this is method overhiding , because it hides method in the parent class.
	}
}
