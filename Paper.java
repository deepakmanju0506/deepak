class Paper
{
	double thickness=2.5;
	char size;
	boolean quality;
	String color;
	
	public  void display()
	{
		System.out.println("Paper thickness is:"+this.thickness);
		System.out.println("Paper size is:"+this.size);
		System.out.println("Paper quality is:"+this.quality);
		System.out.println("Paper color is:"+this.color);
	}
	
	public Paper(char size,boolean quality,String color)
	{
	this.size=size;
	this.quality=quality;
	this.color=color;
	System.out.println("Created Paper");
	}
	public void setPaper(char size,boolean quality,String color)
	{
	this.size=size;
	this.quality=quality;
	this.color=color;
	System.out.println("Created Paper");
	}
}