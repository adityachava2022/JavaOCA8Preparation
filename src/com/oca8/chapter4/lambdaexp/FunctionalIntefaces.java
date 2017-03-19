package com.oca8.chapter4.lambdaexp;

public class FunctionalIntefaces {
	public static void main(String args[])
	{
		FunctionalInteface addition = (int a, int b) -> (a + b);
		
	}
}
// functional interface must have only one abstract method but can have zero or more static/default
// methods
interface FunctionalInteface
{
	public int add(int a, int b);
	default int sub(int a, int b)
	{
		return a-b;
	}
	static int mul(int a, int b)
	{
		return a*b;
	}
};