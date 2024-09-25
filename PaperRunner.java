class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper1=new Paper('S',true,"White");
		paper1.display();
		paper1.setPaper('L',true,"Red");
		paper1.display();
		System.out.println();
		
		Paper paper2=new Paper('M',true,"Black");
		paper2.display();
		paper2.setPaper('S',true,"Green");
		paper2.display();
		System.out.println();
		
		Paper paper3=new Paper('L',true,"Pink");
		paper3.display();
		paper3.setPaper('M',true,"Blue");
		paper3.display();
		System.out.println();
	}
}