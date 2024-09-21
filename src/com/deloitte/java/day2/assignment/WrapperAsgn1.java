package com.deloitte.java.day2.assignment;

public class WrapperAsgn1 {
	public static void main(String[] args) {
		// Convert String to Double
		String str = "12.34";
		Double num = Double.parseDouble(str);
		System.out.println(num);
		System.out.println(str);
		
		// Check a char if its a digit
		char ch = '1';
		System.out.println(Character.isDigit(ch));
		
		// Find maximum of two Integers
		Integer n1 = 10, n2 = 20;
		System.out.println(Integer.max(n1, n2));
	}
}
