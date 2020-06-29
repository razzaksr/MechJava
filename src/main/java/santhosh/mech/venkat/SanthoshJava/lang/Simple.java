package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class Simple 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String roles="DTBLH";
		try
		{
			System.out.println("Tell us position by index");
			System.out.println(roles.charAt(scan.nextInt()));
			System.out.println("You got your job");
		}
		catch(StringIndexOutOfBoundsException sin)
		{
			sin.printStackTrace();
			System.out.println("Tell us position by index within: "+roles.length());
			System.out.println(roles.charAt(scan.nextInt()));
			System.out.println("You got your job");
		}
		finally
		{
			System.out.println("Interview is done");
			scan.close();
		}
	}
}
