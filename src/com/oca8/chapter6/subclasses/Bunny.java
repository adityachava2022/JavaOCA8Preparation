package com.oca8.chapter6.subclasses;

class CanNotHopException extends Exception { }
class Hopper {
	public void hop() { }
}
class Bunny extends Hopper {
	public void hop() throws CanNotHopException { } // DOES NOT COMPILE Exception CanNotHopException is not compatible with throws clause in Hopper.hop()
}