package santhosh.mech.venkat.SanthoshJava.oop;

public class FindAbs extends Self
{
	public void shine()
	{
		System.out.println("FindAbs method");
	}
	public static void main(String[] args) 
	{
		//Self s=new FindAbs();System.out.println(s.find(3));// pattern design
		FindAbs s=new FindAbs();System.out.println(s.find(3));
		s.shine();s.search();
	}
	@Override
	public void search() 
	{
		for(float temp:versions)
		{
			if(temp>=6.1F) {System.out.println(temp);}
		}
	}
}
abstract class Self
{
	float[] versions= {5.1F,4.4F,6.1F,8.1F,9.0F,10.0F};
	public float find(int index)
	{
		if(index<versions.length) {return versions[index];}
		else {System.out.println("Index is not comes under boundry");return 0.0F;}
	}
	public abstract void search();
}