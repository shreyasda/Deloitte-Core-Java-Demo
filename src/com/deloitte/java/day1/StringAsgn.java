package com.deloitte.java.day1;

import java.util.Scanner;

public class StringAsgn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Length of the String
		System.out.println("Enter the sentence:");
		String sentence = sc.nextLine();
		System.out.println(sentence);
		System.out.println("Length of the sentence is " + sentence.length());

		// Reverse
		StringBuilder str = new StringBuilder("Deloitte");
		System.out.println(str.reverse());

		// Compare
		String str1 = "Deloitte";
		String str2 = "Deloitte";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		sc.close();
	}
}
