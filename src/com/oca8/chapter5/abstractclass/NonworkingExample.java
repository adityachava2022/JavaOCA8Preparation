package com.oca8.chapter5.abstractclass;

public class NonworkingExample {
	public abstract void peck(); // DOES NOT COMPILE because it should be under the abstract class. 
	}
}

public abstract class Turtle {
public abstract void swim() {} // DOES NOT COMPILE because it has a method body while abstract methods don't
public abstract int getAge() { // DOES NOT COMPILE because it has a method body while abstract methods don't
return 10;
}
}

public final abstract class Tortoise { // DOES NOT COMPILE abstract class cannot be final.
}

public abstract class Goat {
public abstract final void chew(); // DOES NOT COMPILE abstract methods cannot be final.
}

private abstract class pclass  //does not compile since abstract classes cannot be private.
{
	
}