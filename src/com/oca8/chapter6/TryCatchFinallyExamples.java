package com.oca8.chapter6;

public class TryCatchFinallyExamples {

	public static void main(String[] args) {
		
		/* example 1*/
		/*try // does not compile since not catch block.
		{
			System.out.println(" do something");
		}*/
		
		/* example 2*/
/*		try
		{
			
		}
		finally{
			
		}
		catch{		// does not compile because the order should be try-catch-finally.
			
		}*/

		/* example 3*/
		try
		{
			
		}catch(Exception e){	// note that without the exception name it won't compile	
			
		}
		finally{
			
		}
		/* example 4 */
		/* Catch block is not required if finally is present. */
		try
		{
			
		}
		finally{
			
		}
		
		
	}

}
