package com.xworkz.scanner;

import java.util.Scanner;

public class Example {
	
	
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("Your age is"+age);
		System.out.println("your name ?");
		String name = scanner.nextLine();
		
		System.out.println("hello"+name);
		
		
		
		
	}
	

}
