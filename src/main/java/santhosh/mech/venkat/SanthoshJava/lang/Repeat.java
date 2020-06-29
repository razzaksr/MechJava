package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class Repeat 
{
	Scanner scan=new Scanner(System.in);
	double[] ware= {12.4,9.1,4.5,8.1,1.9,3.9,5.6};
	static int count=1;
	public void check(int index)
	{
		try
		{
			System.out.println(ware[index]);
		}
		catch(ArrayIndexOutOfBoundsException arin)
		{
			if(count<3) 
			{
				System.out.println(arin+"\nSpecify within: "+ware.length);
				count++;
				check(scan.nextInt());
			}
			else {System.out.println("Chances are over");}
		}
	}
	public static void main(String[] args) 
	{
		Repeat rp=new Repeat();
		System.out.println("Tell us index: ");
		rp.check(rp.scan.nextInt());
	}
}
