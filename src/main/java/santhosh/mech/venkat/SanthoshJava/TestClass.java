package santhosh.mech.venkat.SanthoshJava;

public class TestClass 
{
	static double[][] hai= {{1.2,4.5,6.7,1.1},{9.3,0.4,8.9,2.9}};
	public static void main(String[] args) 
	{
		Check chk=new Check();
		chk.jag.report(TestClass.hai);
	}
}
class Check
{
	Jagged jag=new Jagged();
}