class PojectorRunner1
{
	public static void main(String[] args)
	{
		Pojector1 projector1=new Pojector1("Sony","Black",25);
		projector1.display();
		projector1.setPojector1("Samsung","White",26);
		projector1.display();
		System.out.println();
		
		Pojector1 projector2=new Pojector1("Mi","Pink",27);
		projector2.display();
		projector2.setPojector1("Mac","Purple",28);
		projector2.display();
		System.out.println();
		
		Pojector1 projector3=new Pojector1("Cannon","Brown",29);
		projector3.display();
		projector3.setPojector1("HP","Grey",23);
		projector3.display();
		System.out.println();
	}
}