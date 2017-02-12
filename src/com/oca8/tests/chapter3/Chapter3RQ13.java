package com.oca8.tests.chapter3;

public class Chapter3RQ13 {

	public static void main(String[] args) {
		// Stringbuilder cannnot be assigned a string directly.
		StringBuilder b = "rumble";
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);
	}

}
