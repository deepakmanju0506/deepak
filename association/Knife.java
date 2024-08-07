class Knife{
	
	double weight;
	double height;
	
	Knife(double weight, double height)
	{
		this.weight=weight;
		this.height=height;
		System.out.println("Created Knife Const with double and double");
	}
	void show()
	{
		System.out.println("Knife_weight: "+weight);
		System.out.println("Knife_height: "+height);
	}
}

