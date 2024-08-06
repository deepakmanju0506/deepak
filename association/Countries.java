class Countries
{
	String name="INDIA";
	String continent="ASIA";
	State state=new State("KARNATAKA","KANNADA");
	
	Countries()
	{
	System.out.println("Created Country without using argument constructor");
	}
	
	public void countryDisplay()
	{
	System.out.println("Country name:"+this.name);
	System.out.println("Country continent is:"+this.continent);
	this.state.stateDispaly();
	}
}