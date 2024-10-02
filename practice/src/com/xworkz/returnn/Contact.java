package com.xworkz.returnn;

public class Contact {
	
	public static String findContact(long number) {
		
		System.out.println("run findContact in Contact");
		
		if (number == 8147777694l) {
			System.out.println("Shanthi");
			return  "wrong no";
		}
		
		else if(number == 9663255400l) {
			System.out.println("Manjunath");
			return "wrong no";
		}
        else if(number == 6363827480l) {
        	System.out.println("Deepak");
			return "wrong no";
		}
		System.out.println("end findContact in Contact");
		return "null";
	}
     
}
