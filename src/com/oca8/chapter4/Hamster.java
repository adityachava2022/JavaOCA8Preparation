package com.oca8.chapter4;

public class Hamster {
	
	private String color;
	private int weight;
	
	public Hamster(int weight) { // first constructor
		this(weight,"Brown");
	}
	
	public Hamster(String color) { // first constructor
		System.out.println("some statement"); 
		this(100,color);	// doesn't compile since it has to be the first statement in the constructor.
	}
	
	public Hamster(int weight, String color) { // second constructor
		this.weight = weight;
		this.color = color;
	}
}

class suBclass extends Hamster
{
	public suBclass()
	{
		
	}
}