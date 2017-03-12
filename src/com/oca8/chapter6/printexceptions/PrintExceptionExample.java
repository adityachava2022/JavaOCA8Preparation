package com.oca8.chapter6.printexceptions;

public class PrintExceptionExample {
	
	/* 
	 * java.lang.RuntimeException: cannot hop
	 * cannot hop
	 * java.lang.RuntimeException: cannot hop
	 * at trycatch.Handling.hop(Handling.java:15)
	 * at trycatch.Handling.main(Handling.java:7)
	 */
	public static void main(String[] args) {
		 try {
		 hop();
		 } catch (Exception e) {
		 System.out.println(e);
		 System.out.println(e.getMessage());
		 e.printStackTrace();
		 }
	}
	
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
