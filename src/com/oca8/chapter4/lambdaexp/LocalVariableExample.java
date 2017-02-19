package com.oca8.chapter4.lambdaexp;

public class LocalVariableExample {
	public static void main(String args[])
	{
		/*
		 * You should not redeclare the variables with the same name inside the expression.
		 */
		intLambda il1 = (a, b) -> { int a = 0; return 5;}; // DOES NOT COMPILE , duplicate local variable
		intLambda il2 = (a, b) -> { int c = 0; return 5;}; // works
	}
}

interface intLambda
{
	public int value(int a, int b);
};