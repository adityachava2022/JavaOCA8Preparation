package com.oca8.chapter2;

public class ForLoopLimitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Using Incompatible Data Types in the Initialization Block
		for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
			System.out.print(x + " ");
		}
		/*This example also looks a lot like our second example, but like the third example will not
		compile, although this time for a different reason. The variables in the initialization block
		must all be of the same type. In the fi rst example, y and z were both long, so the code compiled
		without issue, but in this example they have differing types, so the code will not compile. */
	}

}
