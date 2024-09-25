   class SoftwareEnginner
 {
	String name="Ravi";
    int experience=5;
	Designation designation=new Designation();
	double salary=50000;
	
	SoftwareEnginner()
    {
		System.out.println("created SoftwareEnginner using no-arg const...");
	}
	
	public void display()
	{
		System.out.println("Name of the employee:"+name);
		System.out.println("Experience:"+experience);
		System.out.println("Designation title :"+designation.title);
		System.out.println("Designation company name :"+designation.companyName);
		System.out.println("Designation id :"+designation.id);
		System.out.println("Salary of the employee:"+salary);
		
		
	}
	
	
	
 }