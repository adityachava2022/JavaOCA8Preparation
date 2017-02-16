package com.oca8.chapter4;

public class VarArgsTest {

	public static void walk(int a, int... args)
	{
		System.out.println(args.length);
	}
	
	public static void run(int... nums) {
		System.out.println(nums[1]);
	}
		
	public static void main(String[] args) {
		/*for Var args:
 			- > You can pass in an array, 
 			- > you can list the elements of the array and let Java create it for you. 
 			- > You can even omit the vararg values in the method call and Java will create an array of length zero for you.*/
		walk(1); 	   				//0
		walk(1,2);     				//1
		walk(1,new int[]{2,3,}); 	//2
		
		//call the var args elements using the index reference itself.
		run(11,22);
		
		walk(1, null); // throws a NullPointerException since java will treat 'NULL' as an array reference
		
		
	}

}
