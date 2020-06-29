package santhosh.mech.venkat.SanthoshJava.oop;

public class Mods 
{
	String[] copied= {"Kennedy","Arasu","ChakdeIndia","Thalaiva","Something"};
	void list()
	{
		for(String hai:copied) {System.out.println(hai);}
	}
	protected void shine(int start,int end)
	{
		System.out.println("Show within interval ");
		while(start<end&&start<copied.length&&end<copied.length)
		{
			System.out.println(copied[start]);start++;
		}
	}
}
