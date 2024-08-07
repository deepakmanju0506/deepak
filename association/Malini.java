class Clip{
	
	String colour;
	String type;
	
	Clip(String colour, String type)
	{
		this.colour=colour;
		this.type=type;
		System.out.println("Created Clip using 2 strings");
	}
	void show()
	{
		System.out.println("Clip_Colour: "+this.colour);
		System.out.println("Clip_Type: "+this.type);
	}
}

class Malini{
	
	String email;
	Clip clip;
	
	Malini(String email, Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("Created Clip using string and clip");
	}
	
	public void display()
	{
		System.out.println("Malini_Email: "+email);
		clip.show();
	}
}