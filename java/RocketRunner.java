class RocketRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("Running in main method");
		Rocket rocket1=new Rocket("India",2000,250);
		rocket1.display();
		rocket1.setRocket("America",2500,280);
		rocket1.display();
		System.out.println();
		
		Rocket rocket2=new Rocket("China",3000,350);
		rocket2.display();
		rocket2.setRocket("Australia",3500,380);
		rocket2.display();
		System.out.println();
		
		Rocket rocket3=new Rocket("Canada",4000,450);
		rocket3.display();
		rocket3.setRocket("Germany",4500,480);
		rocket3.display();
		System.out.println();
	}
}