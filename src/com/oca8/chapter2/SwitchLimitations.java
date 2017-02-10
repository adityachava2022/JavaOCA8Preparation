package com.oca8.chapter2;

public class SwitchLimitations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b  = true;
		Boolean B = Boolean.FALSE
		switch(b) //Cannot switch on a value of type boolean.
		{	      // Only convertible int values, strings or enum variables are permitted
		
		}
		long l = 20;
		switch(l)  //compile error :
		{		   //Cannot switch on a value of type long. 
				   // Only convertible int values, strings or enum variables are permitted
		
		}
	}

}
