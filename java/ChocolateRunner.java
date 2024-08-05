class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate1=new Chocolate(10,"milk",'s');
		chocolate1.display();
		chocolate1.setChocolate(180,"Dark",'m');
		chocolate1.display();
		System.out.println();
		
		Chocolate chocolate2=new Chocolate(20,"white",'m');
		chocolate2.display();
		chocolate2.setChocolate(200,"Dark",'l');
		chocolate2.display();
		System.out.println();
		
		Chocolate chocolate3=new Chocolate(50,"Dark",'s');
		chocolate3.display();
		chocolate3.setChocolate(250,"white",'l');
		chocolate3.display();
		System.out.println();
	}
}