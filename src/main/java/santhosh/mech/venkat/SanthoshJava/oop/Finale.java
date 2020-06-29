package santhosh.mech.venkat.SanthoshJava.oop;

public class Finale extends Sourcing
{
	public void demonstrate()
	{
		System.out.println("Demo of derived class method");
	}
	public static void main(String[] args) 
	{
		Finale fin=new Finale();fin.demonstrate();
		fin.skill=new String[] {"C","Java","DevOPS"};
		fin.display();
	}
}
