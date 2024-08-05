class Speaker
{
	String brand="Sony";
	char size;
	double cost;
	String output;
	
	public void display()
	{
		System.out.println("Speaker brand is:"+this.brand);
		System.out.println("Speaker size is:"+this.size);
		System.out.println("Speaker cost is:"+this.cost);
		System.out.println("Speaker output is:"+this.output);

	}
	
	public Speaker(char size,double cost,String output)
	{
		this.size=size;
		this.cost=cost;
		this.output=output;
		System.out.println("Created Speaker");
	}
	
	public void setSpeaker(char size,double cost,String output)
	{
		this.size=size;
		this.cost=cost;
		this.output=output;
		System.out.println("Created Speaker");
	}
}