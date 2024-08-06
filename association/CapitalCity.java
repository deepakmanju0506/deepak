 class CapitalCity
{
	String name;
	long population;
	
	CapitalCity(String name,long population)
	{
	this.name=name;
	this.population=population;
	System.out.println("Created CapitalCity using argument constructor");
	}
	
	public void display()
	{
		System.out.println("CapitalCity name is:"+this.name);
		System.out.println("CapitalCity population is:"+this.population);
	}
}