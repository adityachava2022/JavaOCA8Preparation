package com.oca8.chapter5.inheritingmethods;

/*
 * output : Marsupial walks on two legs: true
Kangaroo hops on two legs: true

 */
class Marsupial {
	public boolean isBiped() {
		return false;
	}
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
	}
}
public class Kangaroo extends Marsupial {
	public boolean isBiped() {
		return true;
	}
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: "+isBiped());
	}
	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();   // here the isBiped method of the child is called since it is available in
										  // the child.
		joey.getKangarooDescription();
	}
}