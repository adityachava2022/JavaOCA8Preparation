package com.test;

private class SuperClass 
{
	String value = "hello";
	protected String sValue = "world";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sc = new SuperClass();
		System.out.println(sc.value);
		System.out.println(sc.sValue);
	}
}
