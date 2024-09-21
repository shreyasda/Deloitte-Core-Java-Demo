package com.deloitte.java.day2.abstraction;

public class AbstractDemo {
	public static void main(String[] args) {
		HdfcBank bank = new HdfcBank();
		bank.doKYC();
		IciciBank bank1 = new IciciBank();
		bank1.doKYC();
		
		bank.collectTax();
	}
}
