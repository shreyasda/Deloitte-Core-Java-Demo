package com.deloitte.java.day2.abstraction;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunIntDemo {
	public static void main(String[] args) {
		Function<String, Integer> function = str -> str.length();
		System.out.println("Length of string = " + function.apply("shreyas"));
		
		Consumer<String> consumer = a -> System.out.println(a);;
		consumer.accept("Deloitte");
		
		Supplier<Integer> supplier = () -> 10;
		System.out.println(supplier.get());
		
		Predicate<String> predicate = p -> p.equals("String");
		System.out.println(predicate.test("string"));
	}
}
