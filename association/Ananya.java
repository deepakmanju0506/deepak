class Ananya{
	
	long Mobile;
	Knife knife;
	
	Ananya(long Mobile, Knife knife)
	{
		this.Mobile=Mobile;
		this.knife=knife;
		System.out.println("created Ananya Const using long and Knife");
	}
	void display()
	{
		System.out.println("Ananya_Mobile_No: "+Mobile);
		knife.show();
	}
	
}