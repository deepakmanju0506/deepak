package com.xworkz.use;

public class IfStatemaent {
	
	public static void main (String[]args) {
		
		int age=7;
		
		if(age==75) {
			
			System.out.println("your aligible to vote!");
		}
		else if(age>=10) {
			System.out.println("Your are an adult");
		}
		else {
			System.out.println("your not aligible to vote!");
		}
	}

}
