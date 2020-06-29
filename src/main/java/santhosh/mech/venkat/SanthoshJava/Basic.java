package santhosh.mech.venkat.SanthoshJava;

public class Basic 
{
	int hai;
	public Basic()
	{hai='J';System.out.println("Statement @ default Constructor "+hai);}
	
	{hai='z';System.out.println("Statement @ Empty block "+hai);}
	
	static
	{
		Basic hey=new Basic();hey.hai='Z';
		System.out.println("Statement @ static block "+hey.hai);
	}
	public static void main(String[] args) 
	{
		Basic basic=new Basic();basic.hai='A';
		System.out.println("Statement @ main "+basic.hai);
	}
}