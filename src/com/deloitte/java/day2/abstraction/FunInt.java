package com.deloitte.java.day2.abstraction;

@FunctionalInterface
public interface FunInt {
	public abstract void AbsMet();
}

interface Maths{
	public abstract int addNums(int i, int j);
}
class ImplClass implements FunInt {

	@Override
	public void AbsMet() {
		System.out.println("An abstract method");
	}
}
