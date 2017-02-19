package com.oca8.chapter4.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("fish",false,true));
		
		print(animals,a -> a.canSwim());
	}
	
	public static void print(List<Animal> animals, Predicate<Animal> checker)
	{
		for(Animal a : animals)
		{
			if(checker.test(a))
				System.out.println("animal "+a);
			System.out.println();
		}
	}
}
