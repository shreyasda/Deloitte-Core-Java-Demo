package com.deloitte.java.day3.exception;

public class UncheckedDemo {
public static void main(String[] args) {
	int num = 123;
	String str = "abc";
	try {
		num = Integer.parseInt(str);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	System.out.println(num);
}
}
