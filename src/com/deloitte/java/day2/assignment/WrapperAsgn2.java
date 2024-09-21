package com.deloitte.java.day2.assignment;

public class WrapperAsgn2 {
	public static void main(String[] args) {
		// Compare two integer wrapper classes
		Integer num1 = 10;
		int num2 = 10;
//		Integer num3 = new Integer(10);
		System.out.println(num1.equals(num2));// true
		System.out.println(num1 == num2);// true

//		System.out.println(num1 == num3);// false
//		System.out.println(num1.equals(num3));// true
	}
}
