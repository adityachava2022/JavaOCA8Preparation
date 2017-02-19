package com.oca8.chapter4.lambdaexp;

public class LambdaExamples {

	public static void main(String[] args) {
		// with types
		MathOperation addition = (int a, int b) -> (a + b);
		
		// without types and without braces
 		MathOperation subtract = (a,b) -> a-b ;
		
		//with return and curly braces 
		MathOperation multiply= (a,b) -> {return a*b;};
		
		//without return and curly braces
		MathOperation divide = (a,b) -> a / b;
		
		System.out.println("the result is : "+operate(addition , 5, 5));
		System.out.println("the result is : "+operate(subtract, 5, 5));
		System.out.println("the result is : "+operate(multiply, 5, 5));
		System.out.println("the result is : "+operate(divide, 5, 5));

		Greeting greet = a -> System.out.println("hello "+a);
		noArgument na = () -> 42;
		System.out.println(na.empty());
		greet.SayHello("aditya");
	}
	
	public static int operate(MathOperation op,int a , int b)
	{
		return op.operation(a,b);
	}
}

interface MathOperation
{
	int operation(int a, int b);
};

interface Greeting
{
	void SayHello(String name);
};

interface noArgument
{
	int empty();
};