package com.oca8.tests.chapter4.rq29;

interface Secret {
	String magic(double d);
}
class MySecret implements Secret {
	public String magic(double d) {
		return "Poof";
	}
}

class Main
{
	public static void main(String args[])
	{
		Secret s1 = (e) -> "Poof";
		Secret s2 = (e) -> {String f=""; return "Poof";};
		
		/* does not compile
		 (e) -> {"Poof"};	// does not have a semicolon and a return  statement
		 (e) -> { String e = ""; "Poof" }; // duplicate variable is declared and does not have a return  statement
		 (e) -> { String e = ""; return "Poof"; }; // duplicate variable is declared
		 (e) -> { String e = ""; return "Poof" };  // duplicate variable is declared and does not have a semicolon 
		 */
	}
}