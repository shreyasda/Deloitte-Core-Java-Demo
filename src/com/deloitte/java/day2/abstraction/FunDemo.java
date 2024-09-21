package com.deloitte.java.day2.abstraction;

public class FunDemo {
	public static void main(String[] args) {
		FunInt obj = () -> {
			System.out.println("absMethod in FunInt");
		};
		obj.AbsMet();
		FunInt fun = new FunInt() {
			@Override
			public void AbsMet() {
				System.out.println("An abstract method");
			}
		};
		fun.AbsMet();
		
		Maths maths;
		maths =(int n, int m) -> n + m;
		System.out.println(maths.addNums(10, 20));
		
	}
}
