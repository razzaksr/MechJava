package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class Custom 
{
	public static void main(String[] args) 
	{
		String[][] players= {{"IronMan","Hulk","Captain"},{"Loki","Thor"},
				{"Root","Rocoon"},{"SamWilson","Vision","Rody","Wanda"}};
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Tell us favourite: ");
			String fav=scan.next();
			for(String[] row:players)
			{
				for(String each:row)
				{
					if(fav.equalsIgnoreCase(each))
					{
						System.out.println(fav+" available to start end game");
					}else {throw new SanthoshException();}
				}
			}
		}
		catch(SanthoshException san)
		{
			System.out.println(san);
			System.out.println("Tell us favourite: ");
			String fav=scan.next();
			for(String[] row:players)
			{
				for(String each:row)
				{
					if(fav.equalsIgnoreCase(each))
					{
						System.out.println(fav+" available to start end game");
					}
				}
			}
		}
	}
}
