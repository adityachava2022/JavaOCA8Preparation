package com.oca8.chapter2;

public class FloatDouble {

	public static void main(String[] args) {
		// double float max init values
		double d = 39.21;
		float f = 2.1f;
		long max = 3123456789;
		//What is the data type of x * y / z?
				short x = 14;
				float y = 13;
				double z = 30;
				System.out.println(x * y / z);
			/*	In this case, we must apply all of the rules. First, x will automatically be promoted to
				int solely because it is a short and it is being used in an arithmetic binary operation.
				The promoted x value will then be automatically promoted to a float so that it can be
				multiplied with y. The result of x * y will then be automatically promoted to a double,
				so that it can be divided with z, resulting in a double value. */
				
				int x2 = !5; // DOES NOT COMPILE
				boolean y2 = -true; // DOES NOT COMPILE
				boolean z2 = !0; // DOES NOT COMPILE
				int u = !0; //does not compile
	}

}
