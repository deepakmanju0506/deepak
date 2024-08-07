class MaliniRunner{
	
	public static void main(String[] args)
	{
		
	Clip clip = new Clip("Blue", "Paper_clip");
	Malini malini = new Malini("idontknow@gmail.com", clip);
	malini.display();
	System.out.println("=======================================");
	
	Clip clip1 = new Clip("Green", "Hair_Clip");
	Malini malini1 = new Malini("xshsghsga@gmail.com", clip1);
	malini1.display();
	System.out.println("=======================================");
	
	Clip clip2 = new Clip("White", "Vedio_Clip");
	Malini malini2 = new Malini("shbahsgsdvs@gmail.com", clip2);
	malini2.display();
	System.out.println("=======================================");
	}
}
