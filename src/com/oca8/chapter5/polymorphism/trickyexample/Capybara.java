package com.oca8.chapter5.polymorphism.trickyexample;

public class Capybara extends Rodent{

	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara) rodent;	 // compiles but throws a ClassCastException since the ref variable
												 // is an object.
		Rodent rodent1 = null ;
		Capybara cb1 = (Capybara) rodent1;		// fix for the above problem.
	}

}
