package santhosh.mech.venkat.SanthoshJava.lang;

public class Clonings implements Cloneable
{
	String stage="Communal Spread";
	public static void main(String[] args) throws CloneNotSupportedException  
	{
		Clonings c1=new Clonings();
		Clonings c2=new Clonings();
		c1.stage=c1.stage.replace("Communal", "Social");
		c2=c1;// copy object
		System.out.println(c1.stage);
		System.out.println(c2.stage);
		c2.stage="Virus getting weak";
		System.out.println(c2.stage);
		System.out.println(c1.stage);
		Clonings c3=new Clonings();
		c3=(Clonings)c1.clone();
		System.out.println(c3.stage);
		c2.stage="56 percent people getting cured";
		c1.stage="Virus breakdown comes under control";
		c3.stage="144 lifted everything getting normal";
		System.out.println(c1.stage);
		System.out.println(c2.stage);
		System.out.println(c3.stage);
	}
}
