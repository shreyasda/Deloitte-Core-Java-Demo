package com.deloitte.java.day2.abstraction;

abstract class RBI {
	abstract void doKYC();
}

interface FinMin{
	abstract void collectTax();
	default void guidelines() {
		System.out.println("Guidelines from Finance Ministry");
	}
}

class HdfcBank extends RBI implements FinMin{
	@Override
	void doKYC() {
		System.out.println("KYC process in HDFC Bank");
	}

	public void getInsurance() {
		System.out.println("Get your insurance with HDFC");
	}

	@Override
	public void collectTax() {
		System.out.println("Tax paid to Finance Ministry by HDFC");
	}
}

class IciciBank extends RBI {
	@Override
	void doKYC() {
		System.out.println("KYC process in ICICI Bank");
	}
}
