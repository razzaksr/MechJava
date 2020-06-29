package santhosh.mech.venkat.SanthoshJava.lang;

import java.io.IOException;

public class Prompt 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("calc");
		Thread.sleep(5000);
		pro=run.exec("notepad");
		Venkat v=Venkat.getVenkat();v.hai();
	}
}
class Venkat
{
	private Venkat() {}
	private static Venkat ven=new Venkat();
	public static Venkat getVenkat() {return ven;}
	public void hai() {System.out.println("Greeting to all");}
}