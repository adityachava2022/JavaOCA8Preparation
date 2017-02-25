package com.oca8.chapter5.defaultmethods;

public interface SharkFamily extends HasFins {
	public default int getNumberOfFins() {
		return 8;
	}
	public double getLongestFinLength(); // declared as abstract in this child interface.
	public boolean doFinsHaveScales() { // DOES NOT COMPILE  the overriding default methods must have default keyword.
		return false;
	}
}