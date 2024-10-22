package com.xworkz.method;

public class Car {
	
	    String brand;
	    String color;

	    
	    public Car() {
	        this.brand = "Unknown";
	        this.color = "Unknown";
	    }

	    
	    public Car(String brand,String color) {
	        this.brand = brand;
	        this.color = color;
	    }
	    public void displayCar() {
	        System.out.println("Car color: " + color + ", Brand: " + brand);
	    }

	   
}

