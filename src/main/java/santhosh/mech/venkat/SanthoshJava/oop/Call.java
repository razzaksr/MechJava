package santhosh.mech.venkat.SanthoshJava.oop;

public class Call extends Alpha
{
	public Call()
	{
		System.out.println("Viewers gonna watch end game");
	}
	public static void main(String[] args) 
	{
		Call c=new Call();
		c.list();
	}
}
class Alpha
{
	String[] stars;
	public Alpha()
	{
		System.out.println("Cast booked for Endgame");
		stars=new String[] {"Robert downey","Chris Evens","Tom holland","Hemsworth","Scarlet johnson"};
	}
	public void list()
	{
		for(String yet:stars) {System.out.println(yet);}
	}
}