package com.deloitte.java.day2.inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.call();
		phone.sms();

		SmartPhone smartphone = new SmartPhone();
		smartphone.call();
		smartphone.sms();
		smartphone.camera();

		SuperSmartPhone superSmartPhone = new SuperSmartPhone();
		superSmartPhone.ai();
		superSmartPhone.call();
	}
}

class Phone {
	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Texting...");
	}
}

class SmartPhone extends Phone {
	void camera() {
		System.out.println("Clicking...");
	}
}

class SuperSmartPhone extends SmartPhone {
	void ai() {
		System.out.println("Artificial Intelligence...");
	}

	@Override
	void camera() {
		System.out.println("Clicking AI pics...");
	}

}
