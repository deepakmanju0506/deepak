package com.xworkz.equality;

import com.xworkz.equality.internal.Temple;

public class TempleRunner {

	public static void main(String[] args) {

		
		Temple temple1=new Temple("Shiva");
		System.out.println(temple1.hashCode());
		Temple temple2=new Temple("Shiva");
		System.out.println(temple2.hashCode());
		
		boolean same=temple1.equals(temple2);//run time poly
		
		System.out.println("Same :"+same);
		
		//Collection--> HashSet,LinkedHAshSet,TreeSet, HAsh,MAp...
	}

}
