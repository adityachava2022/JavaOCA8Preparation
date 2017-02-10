package com.oca8.chapter3;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExamples {
	public static void main(String args[])
	{
		int primitive = Integer.parseInt("120"); // returns primitive type
		Integer wrapper = Integer.valueOf("120"); // returns wrapper class
		
		//auto boxing and unboxing
		
		
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // [50.5]         // auto boxing : here primitive double is converted to Double
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0); // 60.0  // auto unboxing : here Double Wrapper class is converted double.
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);         // null can be added to the reference variable
		int h = heights.get(0);   // nullpointerException : this is because 'null' cannot be converted to the primitive int
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(1);			// it calls the remove(int) method rather than remove(Object) by using auto boxing.
		System.out.println(numbers);
		
		/*If you
		want to remove the 2, you can write numbers.remove(new Integer(2)) to force wrapper
		class use. */
	}
}
