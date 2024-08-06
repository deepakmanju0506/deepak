class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("Bengaluru",8000000);

	State(String name,String language)
	{
		this.name=name;
		this.language=language;
		System.out.println("Created State using argument constructor");
	}

	public void stateDispaly()
	{
	System.out.println("State name is:"+this.name);
	System.out.println("State language is:"+this.language);
	this.capitalCity.display();
	}
}