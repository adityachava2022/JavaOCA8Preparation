package com.oca8.chapter5.abstractclass;

abstract class BigCat extends Animal {
	public abstract void roar();
}
public class Lion extends BigCat {
	public String getName() {
		return "Lion";
	}
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
}