package com.oca8.chapter6.runtimeexceptions;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
// exception is Exception in thread "main" java.lang.ArithmeticException: / by zero
// at com.oca8.chapter6.runtimeexceptions.ArithmeticExceptionExample.main(ArithmeticExceptionExample.java:7)
		int a = 10/0;
	}

}
