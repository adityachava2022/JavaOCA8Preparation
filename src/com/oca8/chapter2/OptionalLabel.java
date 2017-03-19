package com.oca8.chapter2;

public class OptionalLabel {

	public static void main(String[] args) {
		// 
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
		
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}
	}
}
