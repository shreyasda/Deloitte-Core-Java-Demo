package com.deloitte.java.day2.package1;

public class AccessDemo {
	public static int num1 = 10;
	protected static int num2 = 20;
	static int num3 = 30;
	private static int num4 = 40;

	public static void main(String[] args) {
		System.out.println(AccessDemo.num1);
		System.out.println(AccessDemo.num2);
		System.out.println(AccessDemo.num3);
		System.out.println(AccessDemo.num4);
	}
}
