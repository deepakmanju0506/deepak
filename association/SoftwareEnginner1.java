class SoftwareEnginner1
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner1(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("Created SoftwareEnginner using argument constructor");
	}
	
	public void visible()
	{
		System.out.println("SoftwareEnginner name:"+this.name);
		System.out.println("SoftwareEnginner experience:"+this.experience);
		System.out.println("SoftwareEnginner designation:"+this.designation);
		System.out.println("SoftwareEnginner salary:"+this.salary);

	}
}