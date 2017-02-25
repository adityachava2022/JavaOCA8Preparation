package com.oca8.chapter5.interfaces;


public class WrongExamplesOfInterfaces {

	public static void main(String[] args) {
		WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE	interface cannot be instantiated
	}
}
public final interface WalksOnEightLegs { // DOES NOT COMPILE interface cannot be final.
}

interface CanRun {}
class Cheetah extends CanRun {} // DOES NOT COMPILE
class Hyena {}
interface HasFur extends Hyena {} // DOES NOT COMPILE