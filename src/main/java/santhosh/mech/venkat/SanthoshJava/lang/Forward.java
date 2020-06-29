package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class Forward 
{
	Scanner scan=new Scanner(System.in);
	double[] ware= {12.4,9.1,4.5,8.1,1.9,3.9,5.6};
	public void check(int index)
	{
		try
		{
			System.out.println(ware[index]);
		}
		catch(ArrayIndexOutOfBoundsException arin)
		{
			throw arin;
		}
	}
	public static void main(String[] args) 
	{
		Forward forw=new Forward();
		try
		{
			System.out.println("Tell us index: ");
			forw.check(forw.scan.nextInt());
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a+"\nSpecify within: "+forw.ware.length);
			forw.check(forw.scan.nextInt());
		}
	}
}
