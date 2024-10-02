package com.xworkz.method;

    public class Laptop
{
     public static void info( ) {
    	 String brand = "Dell";
    	 int modelno= 3530;
    	 System.out.println("print brand name"+brand);
    	 System.out.println("print model no"+modelno);
     }
	
     public static void info(int modelno) {
    	 
    	 System.out.println("print the "+modelno);
     }
     public static void cost (int modelno,double price ) {
    	 System.out.println("print the modelno"+modelno);
    	 System.out.println("print the price"+price);
    	 
     }
     
     public static void cost(int modelno,double cost,byte quantity) {
    	 
    	 System.out.println("print the modelno"+modelno);
    	 System.out.println("print the cost"+cost);
    	 System.out.println("print the quantity"+quantity);
     }
     
     
     
	
}
