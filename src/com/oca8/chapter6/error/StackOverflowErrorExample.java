package com.oca8.chapter6.error;

public class StackOverflowErrorExample {
	/*
	 * The output contains this line:
	 * Exception in thread "main" java.lang.StackOverflowError
     * Since the method calls itself, it will never end. Eventually, Java runs out of room on the
     * stack and throws the error. This is called infinite recursion. It is better than an infinite loop
     * because at least Java will catch it and throw the error. With an infinite loop, Java just uses
     * all your CPU until you can kill it.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doNotCodeThis(1);
	}
	
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
	}
}
