class Fruit
{    int price=250;
	public static double fruits(String name,int quantity)
	{double total=0;
		if(name=="Apple")
		{
		  
		 total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Orange")
		{
		  int price=40;
		  double total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Kiwi")
		{
		  int price=100;
		  double total=quantity*price;
		 return total;
		} 
		
		
		if(name=="Grappes")
		{
		  int price=130;
		  double total=quantity*price;
		 return total;
		} 
		
         if(name=="Pinapple")
		{
		  int price=150;
		  double total=quantity*price;
		 return total;
		} 
		
		return 0;
	}
	
}