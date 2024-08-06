class Owner
{
	String name;
	int age;
	char gender;

	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("Created Owner with argument constructor");
	}

	public void show()
	{
		System.out.println("Owner name is:"+this.name);
		System.out.println("Owner age is:"+this.age);
		System.out.println("Owner gender is:"+this.gender);

	}
}