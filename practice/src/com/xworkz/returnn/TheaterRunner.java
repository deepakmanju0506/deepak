package com.xworkz.returnn;

public class TheaterRunner {
	
	public static void main (String[]args) {
		
		String seat1=Theater.book(101);
		System.out.println("======="+seat1);
		
		String seat2=Theater.book(151);
		System.out.println("======="+seat2);
	
		String seat3=Theater.book(201);
		System.out.println("======="+seat3);
		
		
	}

}
