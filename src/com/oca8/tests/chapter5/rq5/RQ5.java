package com.oca8.tests.chapter5.rq5;

class PRQ5 {
	int variable = 1;
}

public class RQ5 extends PRQ5{
	int variable = 11;
	
	public static void main(String args[])
	{
		PRQ5 pr = new RQ5();
		System.out.println(pr.variable);  // 1 always it will hide.
	}
	
}
