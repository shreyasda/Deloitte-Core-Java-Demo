package com.deloitte.java.day3.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<String> friends = new ArrayList<String>();
	friends.add("Ashok");
	friends.add("Shubha");
	friends.add("Shreyas");
	System.out.println(friends);

	//Iterate using for
	System.out.println("Iterate using for loop");
	for (int i = 0; i < friends.size(); i++) {
		System.out.println(friends.get(i));
	}
	
	//Iterate using for-each
	System.out.println("Iterate using for-each loop");
	for (String string : friends) {
		System.out.println(string);
	}
	
	//Iterate using Iterator
	System.out.println("Iterate using Iterator");
	for (Iterator<String> iterator = friends.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string);
	}
}
}
