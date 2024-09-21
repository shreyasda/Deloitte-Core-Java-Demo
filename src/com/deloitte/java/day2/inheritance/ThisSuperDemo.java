package com.deloitte.java.day2.inheritance;

import java.util.Objects;

class Cars {
	String colour;
	int cost;
	String type;

	public Cars(String colour, int cost, String type) {
		this.colour = colour;
		this.cost = cost;
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, cost, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cars other = (Cars) obj;
		return Objects.equals(colour, other.colour) && cost == other.cost && Objects.equals(type, other.type);
	}

}

class Baleno extends Cars {

	public Baleno(String colour, int cost, String type) {
		super(colour, cost, type);
	}

}

public class ThisSuperDemo {
	public static void main(String[] args) {
		Cars car = new Cars("Blue", 1000000, "Petrol");
		Cars newCar = new Cars("Blue", 1000000, "Petrol");
		System.out.println(car.equals(newCar));
	}
}
