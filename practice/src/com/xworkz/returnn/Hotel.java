package com.xworkz.returnn;

public class Hotel {

	public static String order (int price)
	{
		
		System.out.println("start order in hotel");
			
			 if (price == 45) {
				 System.out.println("idaly");
				 return "idaly";
				 
			 }
			 else if (price == 55){	
				 System.out.println("idaly vada");
		return "idaly vada";
	}
			 else if(price == 60) {
				 System.out.println("masal dosa");
			return " no item avilabel";
			 }
			System.out.println("end the order in hotel");
			return "null";
	}
	
	
	
}
