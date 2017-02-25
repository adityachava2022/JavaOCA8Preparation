package com.oca8.chapter5.defaultmethods;

interface Walk {
	public default int getSpeed() {
		return 5;
	}
}
interface Run {
	public default int getSpeed() {
		return 10;
	}
}
/*If a class implements two interfaces that have default methods with the same name and
signature, the compiler will throw an error */
public class Cat implements Walk, Run { // DOES NOT COMPILE
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}

/*There is an exception to this rule, though: if
the subclass overrides the duplicate default methods, the code will compile without
issue—the ambiguity about which version of the method to call has been removed. For
example, the following modified implementation of Cat will compile and output 1: */
class Cat2 implements Walk, Run {
public int getSpeed() {
return 1;
}
public static void main(String[] args) {
System.out.println(new Cat().getSpeed());
}
}