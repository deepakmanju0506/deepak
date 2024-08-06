class Company1
{
	int id=101;
	String name="TCS";
	String location="Bangalore";
	SoftwareEnginner1 softwareEnginner1=new SoftwareEnginner1("AnanyaP",1,"Dev",50000);
	
	Company1()
	{
	System.out.println("Cteated Company1 without argument constructor");
	}
	
	public void company1Visible()
	{
	System.out.println("Company1 id is:"+this.id);
	System.out.println("Company1 name is:"+this.name);
	System.out.println("Company1 location is:"+this.location);
	this.softwareEnginner1.visible();
	}
	
}