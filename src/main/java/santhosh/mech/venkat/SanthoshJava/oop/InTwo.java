package santhosh.mech.venkat.SanthoshJava.oop;

public class InTwo 
{
	String hai="Wrestlemania";
	public int findNCount()
	{
		int count=0;
		for(int index=0;index<hai.length();index++)
		{
			if(hai.charAt(index)=='a' || hai.charAt(index)=='e' || hai.charAt(index)=='i' ||  hai.charAt(index)=='o' || hai.charAt(index)=='u')
			{
				count++;
			}
		}
		return count;
	}
	class Determine
	{
		public void duplicates()
		{
			for(int begin=0;begin<hai.length();begin++)
			{
				for(int end=hai.length()-1;end>begin;end--)
				{
					if(hai.charAt(begin)==hai.charAt(end)) {
						System.out.println(hai.charAt(begin));
					}
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		InTwo in=new InTwo();
		System.out.println(in.findNCount());
		Determine det=in.new Determine();
		det.duplicates();
	}
}