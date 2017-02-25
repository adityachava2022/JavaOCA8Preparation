package com.oca8.chapter5.abstractclass;

abstract class Whale {
	protected abstract void sing();
}
public class HumpbackWhale extends Whale {
	private void sing() { // DOES NOT COMPILE it should be protected or default or public.
		System.out.println("Humpback whale is singing");
	}
}