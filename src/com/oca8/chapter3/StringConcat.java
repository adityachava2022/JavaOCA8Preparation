package com.oca8.chapter3;

public class StringConcat {

	public static void main(String[] args) {
		
		/* 1. If both operands are numeric, + means numeric addition.
		2. If either operand is a String, + means concatenation.
		3. The expression is evaluated left to right.
		/* in simple terms,use numeric addition if two numbers are involved,
use concatenation otherwise, and evaluate from left to right.*/
		
		System.out.println(1 + 2); // 3
		System.out.println("a" + "b"); // ab
		System.out.println("a" + "b" + 3); // ab3
		System.out.println(1 + 2 + "c"); // 3c
		
	}

}
