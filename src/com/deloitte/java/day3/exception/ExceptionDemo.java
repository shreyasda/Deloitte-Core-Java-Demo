package com.deloitte.java.day3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		try {
			int i = sc.nextInt();
			int j = sc.nextInt();
			System.out.println(i/j);
		} 
		catch (ArithmeticException a) {
			System.out.println("ArithmeticException 1"+a.getMessage());
		}
		catch (InputMismatchException a) {
			System.out.println("InputMismatchException "+a.getMessage());
		}
		catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
		System.out.println("End");
	}
}
