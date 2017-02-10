package com.test;

public class TestClass
{
	public static void main(String args[])
	{
		Number numbers[] = new Number[4];
		numbers[0] = new Byte((byte) 12);
		numbers[1] = new Integer(12);
		numbers[2] = new Float(12f);
		numbers[3] = new Double(12);
		System.out.println("The sum of the numbers : "+ sum(numbers));
	}

	public static Double sum(Number[] numbers)
	{
		// TODO Auto-generated method stub
		double d = 0.0 ;
		for(int i =0 ; i< numbers.length; i++)
			d = d + numbers[i].doubleValue();
		return d;
	}
}
