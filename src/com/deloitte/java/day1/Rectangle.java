package com.deloitte.java.day1;

public class Rectangle {
	int length;
	int width;

	Rectangle() {
		length = 10;
		width = 20;
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	double calculateArea() {
		return length * width;
	}

	double calculateArea(int length, int width) {
		return this.length * this.width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.calculateArea());

		Rectangle r2 = new Rectangle(30, 40);
		System.out.println(r2.calculateArea());
	}
}
