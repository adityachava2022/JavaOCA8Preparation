package com.oca8.chapter2;

public class FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 39.21;
		float y = 2.1f;
		long max = 3123456789;
		//What is the data type of x * y / z?
				short x1 = 14;
				float y1 = 13;
				double z = 30;
				System.out.println();
			/*	In this case, we must apply all of the rules. First, x will automatically be promoted to
				int solely because it is a short and it is being used in an arithmetic binary operation.
				Working with Unary Operators 57
				The promoted x value will then be automatically promoted to a float so that it can be
				multiplied with y. The result of x * y will then be automatically promoted to a double,
				so that it can be multiplied with z, resulting in a double value. */
				
				int x2 = !5; // DOES NOT COMPILE
				boolean y2 = -true; // DOES NOT COMPILE
				boolean z2 = !0; // DOES NOT COMPILE
				int u = !0; //does not compile
	}

}
