package com.xworkz.use;

public class Switch {

	public static void main(String[] args) {
		
		String day="monday";
		
		switch(day) {
		case "Sunday":System.out.println("It is Sunday!");
		break;
		case "Monday":System.out.println("It is Monday!");
		break;
		case "Tuesday":System.out.println("It is Tuesday!");
		break;
		case "Wednesday":System.out.println("It is Wednesday!");
		break;
		case "Thursday":System.out.println("It is Thuresday!");
		break;
		case "Friday":System.out.println("It is Friday!");
		break;
		default:System.out.println("this is not a day");
		
		}
	}

}
