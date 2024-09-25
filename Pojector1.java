class Pojector1
{
	String company;
	String type="Auto";
	String color;
	double weight;
	
	public void display()
	{
		System.out.println("Pojector1 company is:"+this.company);
		System.out.println("Pojector1 type is:"+this.type);
		System.out.println("Pojector1 color is:"+this.color);
		System.out.println("Pojector1 weight is:"+this.weight);

	}
	
	public Pojector1(String company,String color,double weight)
	{
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Created Pojector1");
	}
	
	public void setPojector1(String company,String color,double weight)
	{
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Created Pojector1");
	}
}