package com.test;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();

		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
	}

}
