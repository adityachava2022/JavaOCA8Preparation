package com.oca8.tests.chapter4.rq13;

public class RopeSwing {
	private static final String leftRope;
	private static final String rightRope;
	private static final String bench;
	private static final String name = "name";
	static {
		leftRope = "left";
		rightRope = "right";
    }
	static {
		name = "name"; //already initialized
		rightRope = "right"; //already initialized
	}
	public static void main(String[] args) {
		bench = "bench"; //already initialized
	}
}