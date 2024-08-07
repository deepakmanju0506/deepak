class AnanyaRunner{
	
	public static void main(String[] args)
	{
		Knife knife = new Knife(12.2, 800);
		Ananya ananya = new Ananya(9886899911L, knife);
		ananya.display();
		System.out.println("===========================================");
		
		Knife knife1 = new Knife(10.9, 600);
		Ananya ananya1 = new Ananya(7856899921L, knife1);
		ananya1.display();
		System.out.println("===========================================");
		
		
	}
}