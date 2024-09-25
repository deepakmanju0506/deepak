package com.xworkz.method;

public class MethodExample {
	
	public static void addition() {
		
		int a = 20;
		int b =10;
		int c = a+b;
		System.out.println("Result -"+ c);
	}
	  
	void sub(int a , int b)
	{
		
		int c = a-b;
		System.out.println("Print c in sub - "+c);
	}
	
	void str(String a,String b,String c) {
		
		System.out.println("Result- "+a+b+c);
	}
	public static void main (String[]args)
	{
		MethodExample caller = new MethodExample();
	    caller.addition();
		caller.sub(25, 20);
		caller.str(null,null,null);
	}
	  
}
