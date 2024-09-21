package com.deloitte.java.day1;

public class Person {
	String name;
	int age;
	String gender;

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	void displayPersonInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Gender: " + this.gender);
	}

	public static void main(String[] args) {
		Person person = new Person("Shreyas", 22, "Male");
		person.displayPersonInfo();
	}
}
