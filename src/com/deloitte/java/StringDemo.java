package com.deloitte.java;

public class StringDemo {

	public static void main(String[] args) {
//		String str = "shreyas";
//		System.out.println(str);
//		str = "shreyas d a";
//		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		String str = "shreyas";
		String str1 = str;
		String str2 = new String("shreyas");
		
		System.out.println(str.equals(str1));
		System.out.println(str.equals(str2));
		System.out.println(str1.equals(str2));
	}
}
