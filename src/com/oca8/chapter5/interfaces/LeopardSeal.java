package com.oca8.chapter5.interfaces;

interface HasTail {
	public int getTailLength();
}
interface HasWhiskers {
	public int getNumberOfWhiskers();
}
abstract class HarborSeal implements HasTail, HasWhiskers {
}
public class LeopardSeal implements HasTail, HasWhiskers { // DOES NOT COMPILE since the first concrete class
														   // should implement all the methods.
}
