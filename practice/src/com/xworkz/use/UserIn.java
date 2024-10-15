package com.xworkz.use;

import java.util.Scanner;

public class UserIn {


	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Waht is your name ?");
		String name = scanner.nextLine();
		
		System.out.println("hello :"+name);
		
		System.out.println("what is your age ?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("your"+age+"years old");
		System.out.println("What is your favroute food ?");
		String food = scanner.nextLine();
		System.out.println("your favroute food :"+food);
	}


}
