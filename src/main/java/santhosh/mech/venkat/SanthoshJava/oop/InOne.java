package santhosh.mech.venkat.SanthoshJava.oop;

public class InOne 
{
	static int[] mark= {98,120,45,89,111,34};
	public void shake()
	{
		for(int temp:mark)
		{
			System.out.println(temp);
		}
	}
	static class Venkat
	{
		public void shine()
		{
			System.out.println("Reverse order array");
			for(int index=mark.length-1;index>=0;index--)
			{
				System.out.println(mark[index]);
			}
		}
	}
	public static void main(String[] args) 
	{
		InOne in=new InOne();in.shake();
		InOne.Venkat ven=new InOne.Venkat();
		ven.shine();
	}
}
