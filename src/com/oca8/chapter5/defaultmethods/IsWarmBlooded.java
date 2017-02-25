package com.oca8.chapter5.defaultmethods;

//all methods in an interface must be public.
public interface IsWarmBlooded {
	boolean hasScales();
	public default double getTemperature()  
	{
		return 50.0;
	}
}
