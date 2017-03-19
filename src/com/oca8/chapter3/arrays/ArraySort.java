package com.oca8.chapter3.arrays;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.print (numbers[i] + " ");
	}

}
