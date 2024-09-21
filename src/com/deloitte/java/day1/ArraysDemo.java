package com.deloitte.java.day1;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int num : array) {
			System.out.println(num);
		}

		Person[] details = { new Person("Shreyas", 22, "Male"), new Person("Virat", 35, "Male") };

		for (Person person : details) {
			person.displayPersonInfo();
		}
	}
}
