package com.oca8.chapter4;

public class StaticTrickyExample {

	public static void main(String[] args) {
		/* You can use an instance of the object to call a static method.
		 * The compiler checks for the type of the reference and
		 * uses that instead of the object */

		 Koala k = new Koala();
		 System.out.println(k.count); // k is a Koala
		 k = null;
		 System.out.println(k.count); // k is still a Koala
		 
		 //ex2
		 
		 Koala.count = 4;
		 Koala koala1 = new Koala();
		 Koala koala2 = new Koala();
		 koala1.count = 6;
		 koala2.count = 5;
		 System.out.println(Koala.count);  //5  .. it will use the same variable for all the instances
	}

}

class Koala
{
	public static int count = 0;
}
