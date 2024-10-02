package com.xworkz.method;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop.info();
		Laptop.info(5350);
		Laptop.cost(5450,75.000d);
        Laptop.cost(007, 45.000,(byte) 1);
	}

}
