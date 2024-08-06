class Hotel
{
	String name="ISIRI";
	Owner owner=new Owner("Deepak.M",22,'M');

	Hotel()
	{
		System.out.println("Created Hotel without argument constructor");
	}

	public void showHotel()
	{
		System.out.println("Hotel name is:"+name);
		this.owner.show();
	}
}