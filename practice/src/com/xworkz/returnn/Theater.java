package com.xworkz.returnn;

public class Theater {
	
	public static String book(int price)
	{
		
		
		System.out.println("run book ticket in the theater ");
		
		if (price == 100) {
			
			System.out.println("Gandhi Class");
			
			return "  book the ticket" ;
		}
		
		else if (price > 100) {
			
			return "don't book the ticket";
		}
		
		else if(price == 150){	
			 System.out.println("Middel Class");
			 
	return "cancel  the ticket";
}
		else if (price > 150) {
			
			return "don't book the ticket";
		}
		 else if(price == 200) {
			 System.out.println("Balcony");
			 
		return "dont't book the ticket";
		 }

			else if (price > 200) {
				
				return "don't book the ticket";
			}
		
		System.out.println("end  book ticket in the theater ");
		
  return "null";
	}

}

