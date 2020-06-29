package santhosh.mech.venkat.SanthoshJava.oop;

public class Differ1 extends How implements Fine
{
	public static void main(String[] args) 
	{
		Differ1 dif=new Differ1();
		System.out.println(dif.perform());
		dif.cast();
	}

	@Override
	public int perform() {
		// TODO Auto-generated method stub
		int bit=set[0];
		for(int hai=1;hai<set.length;hai++) 
		{bit^=set[hai];}
		return bit;
	}
	public void cast() 
	{
		super.cast();
		System.out.println("Bitwise shift gonna performed");
		for(byte say:this.yet)
		{
			if(say%2==0) {System.out.println(say>>3);}
			else {System.out.println(say<<3);}
		}
	}
	@Override
	public int performing() {
		// TODO Auto-generated method stub
		return 0;
	}
}
interface Fine
{
	char[] set= {'W','t','s','R','m','D'};
	// abstract method: method comes along semicolon without body
	public int perform();
	public int performing();
}
class How
{
	byte[] yet= {65,98,120,71,87,91};
	// non abstract: method with definition
	public void cast() {
		System.out.println("Listing all byte as character");
		for(byte temp:yet) {System.out.println((char)temp);}
	}
}