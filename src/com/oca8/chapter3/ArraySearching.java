package com.oca8.chapter3;

import java.util.Arrays;

public class ArraySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Target element found in sorted array     ->  Index of match
		  Target element not found in sorted array ->  Negative value showing one smaller than the
													   negative of index, where a match needs to be
													   inserted to preserve sorted order

		 */
		int[] numbers = {2,4,6,8};
		System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		System.out.println(Arrays.binarySearch(numbers, 1)); // -1
		System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		
		/* not sorted example 
		   As soon as you see the array isn’t sorted, 
		   look for an answer choice about unpredictable output
		*/
		int[] numbers1 = new int[] {3,2,1};
		System.out.println(Arrays.binarySearch(numbers1, 2));
		System.out.println(Arrays.binarySearch(numbers1, 3));
		
		/* multi-dimensional array */
		int[][] vars1; // 2D array
		int vars2 [][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
	}

}
