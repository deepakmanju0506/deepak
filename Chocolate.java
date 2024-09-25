class Chocolate
{
	String brand="Nestle";
	double price;
	String flavour;
	char size;
	
	public void display()
	{
		System.out.println("Chocolate brand is"+this.brand);
		System.out.println("Chocolate price is"+this.price);
		System.out.println("Chocolate flavour is"+this.flavour);
		System.out.println("Chocolate size is"+this.size);

	}
	
	public Chocolate(double price,String flavour,char size)
	{
	 this.price=price;
	 this.flavour=flavour;
	 this.size=size;
	 System.out.println("Created Chocolate");
	}
	
	public void setChocolate(double price,String flavour,char size)
	{
	 this.price=price;
	 this.flavour=flavour;
	 this.size=size;
	 System.out.println("Created Chocolate");
	}
}