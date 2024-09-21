package com.deloitte.java;

public class Hello {
	public static void main(String[] args) {
//		byte b1 = 127;
//		byte b2 = 1;
//		byte b3 = (byte) (b1 + b2);
//		System.out.print(b3);
		
		String[] friends = {"Sonu", "Monu", "Tonu", "Ponu"};
		for(int i = 0;i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		for(String friend: friends) {
			System.out.println(friend);
		}

	}

}
