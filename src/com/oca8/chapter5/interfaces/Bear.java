package com.oca8.chapter5.interfaces;

//the following code will not compile: because two same methods with diff return types.
interface Herbivore {
	public int eatPlants();
}

interface Omnivore {
	public void eatPlants();
}

interface Supervore extends Herbivore, Omnivore {} // DOES NOT COMPILE because of two conflicting methods
abstract class AbstractBear implements Herbivore, Omnivore {} // DOES NOT COMPILE because of two conflicting methods

public class Bear implements Herbivore, Omnivore {
	public int eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants: 10");
	return 10;
	}
	public void eatPlants() { // DOES NOT COMPILE
		System.out.println("Eating plants");
	}
}