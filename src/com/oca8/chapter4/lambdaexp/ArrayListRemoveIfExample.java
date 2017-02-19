package com.oca8.chapter4.lambdaexp;

import java.util.List;
import java.util.ArrayList;

public class ArrayListRemoveIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> bunnies = new ArrayList<>();
		bunnies.add("anybunny");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		
		System.out.println(bunnies);
		
		// from the arraylist remove all the strings starting with 'h'
		bunnies.removeIf(s -> s.charAt(0) == 'h' );
		
		System.out.println(bunnies);
	}

}
