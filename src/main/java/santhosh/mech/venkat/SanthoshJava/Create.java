package santhosh.mech.venkat.SanthoshJava;

public class Create 
{
	public static void main(String[] args) 
	{
		int yet=89;
		Systems.out.printlns();
		Systems sys=new Systems();
		System.out.println(sys.hai);
		System.out.println(yet);
	}
}
class PrintStreams
{
	public void printlns()
	{
		System.out.println("Out invoked");
	}
}
class Systems
{
	static PrintStreams out=new PrintStreams();
	int hai;
}