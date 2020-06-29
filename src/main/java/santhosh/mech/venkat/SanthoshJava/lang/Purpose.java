package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class Purpose 
{
	public static void main(String[] args) 
	{
		int temp=0;
		Scanner scan=new Scanner(System.in);
		for(int mine=0;mine<args.length;mine++)
		{
			try
			{
				temp=Integer.parseInt(args[mine]);
			}
			catch(NumberFormatException num)
			{
				System.out.println(num+"\nEnter the number again: ");
				//continue;
				temp=scan.nextInt();
			}
			if(temp==2||temp==3||temp==5||temp==7||temp%2!=0&&temp%3!=0&&
					temp%5!=0&&temp%7!=0)
			{
				System.out.println(temp);
			}
		}
		scan.close();
	}
}