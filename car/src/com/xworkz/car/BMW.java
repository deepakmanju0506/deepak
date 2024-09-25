package com.xworkz.car;

public class BMW extends Car {
	
	public BMW() {
		super(100);
		System.out.println("this is parent");
	}
		public BMW(int a,String name ) {
			this();
			System.out.println("this conster");
		}
	}


