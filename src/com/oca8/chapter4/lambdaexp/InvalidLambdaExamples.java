package com.oca8.chapter4.lambdaexp;

public class InvalidLambdaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You can omit the braces around parameters , if there is only one parameter and its
		 * type is not specified.
		 */
		invalidLambdaExp ile = (a, b -> a.startsWith("test")); // DOES NOT COMPILE , it has two parameters
		/*
		 * If you are using curly braces, then you need to specify the return statment and semicolon.
		 */
		invalidLambdaExp ile2 = a -> { a.startsWith("test"); }; // DOES NOT COMPILE, it has no return statement.
		invalidLambdaExp ile3 = (a -> { return a.startsWith("test") }); // DOES NOT COMPILE, it has no semicolon at the end.
		

	}
	
}

interface invalidLambdaExp
{
	public String funct(String a);
};