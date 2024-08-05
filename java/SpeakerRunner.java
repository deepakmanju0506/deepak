class SpeakerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running in main method");
		Speaker speaker1=new Speaker('S',20000,"Good Quality Speaker");
		speaker1.display();
		speaker1.setSpeaker('M',25000,"Good Quality Speaker");
		speaker1.display();
		System.out.println();
		
		Speaker speaker2=new Speaker('M',30000,"Good Quality Speaker");
		speaker2.display();
		speaker2.setSpeaker('S',25000,"Good Quality Speaker");
		speaker2.display();
		System.out.println();
		
		Speaker speaker3=new Speaker('S',40000,"Good Quality Speaker");
		speaker3.display();
		speaker3.setSpeaker('M',55000,"Good Quality Speaker");
		speaker3.display();
		System.out.println();
	}
}