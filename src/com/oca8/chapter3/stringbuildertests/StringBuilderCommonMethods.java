package com.oca8.chapter3.stringbuildertests;

public class StringBuilderCommonMethods {

	public static void main(String[] args) {
		StringBuilder e = new StringBuilder();
		StringBuilder sbex = new StringBuilder("animal");
		StringBuilder sn = new StringBuilder(10);
		
		//charAt(), indexOf(), length(), and substring()
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
		
		//append() : StringBuilder append(String str)
		StringBuilder sb1 = new StringBuilder().append(1).append('c');
		sb1.append("-").append(true);
		System.out.println(sb1); // 1c-true
		
		//insert() : StringBuilder insert(int offset, String str)
		sb.insert(7, "-"); // sb = animals-
		sb.insert(0, "-"); // sb = -animals-
		sb.insert(4, "-"); // sb = -ani-mals
		System.out.println(sb);
		
		//delete()   : StringBuilder delete(int start, int end)
		//deleteCharAt() : StringBuilder deleteCharAt(int index)
		StringBuilder sb2 = new StringBuilder("abcdef");
		sb2.delete(1, 3); // sb = adef
		sb2.deleteCharAt(5); // throws StringIndexOutOfBoundsException.
		
		//reverse() : StringBuilder reverse()
		StringBuilder sbr = new StringBuilder("ABC");
		sbr.reverse();
		System.out.println(sbr);
		
		//toString() : String toString()
		String s = sb.toString();
		System.out.println(s);
	}

}
