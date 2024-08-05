class Rocket
{
	String country;
	int speed;
	double fuelcapacity;
	int noOfThrusters=10;
	
	public void display()
	{
		System.out.println("Rocket country is:"+this.country);
		System.out.println("Rocket speed is:"+this.speed);
		System.out.println("Rocket fuelcapacity is:"+this.fuelcapacity);
		System.out.println("Rocket noOfThrusters is:"+this.noOfThrusters);

	}
	
	Rocket(String country,int speed,double fuelcapacity)
	{
		this.country=country;
		this.speed=speed;
		this.fuelcapacity=fuelcapacity;
		System.out.println("Created Rocket");
	}
	
	public void setRocket(String country,int speed,double fuelcapacity)
	{
		this.country=country;
		this.speed=speed;
		this.fuelcapacity=fuelcapacity;
		System.out.println("Created Rocket");
	}
}