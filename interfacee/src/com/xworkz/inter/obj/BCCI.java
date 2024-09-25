package com.xworkz.inter.obj;

import com.xworkz.inter.media.CricketRulz;

public class BCCI {
	
	private CricketRulz cricketRulz;
	
	public static void setCricketRulz(CricketRulz cricketRulz );
	 this.cricketRulz=cricketRulz;
			 

public void check() {
	
	System.out.println("Running CricketRulz in BCCI");
	if(cricketRulz != null)
	{
		System.out.println("CricketRulz is not equal to null");
		cricketRulz.powerPlay();
		
	} else {
		System.out.println("is equal to zero");
	}
	
}

}
