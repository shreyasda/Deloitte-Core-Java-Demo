package com.deloitte.java.day3.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Ashok");
		friends.add("Shubha");
		friends.add("Shreyas");
		System.out.println(friends);

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(10);
		num.add(100);
		num.add(1000);
	}
}
