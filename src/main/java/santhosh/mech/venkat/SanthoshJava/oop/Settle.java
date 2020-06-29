package santhosh.mech.venkat.SanthoshJava.oop;

import java.util.Scanner;

public class Settle extends PayUMoney 
{
	public Settle() 
	{
		System.out.println("Welcome to WWE Network");
		show();
	}
	public static void main(String[] args) 
	{
		Settle set=new Settle();set.purchase();
	}
}
class Ware
{
	String[] items= {"Wrestlemania","Summerslam","No way out","Fast lane",
		"No mercy","Back lash","Survivor Series","Vengence","Crown Jewel"};
	public void show()
	{
		System.out.println("Here is following events available");
		for(String each:items) {System.out.println(each);}
	}
	public int choose(int order)
	{
		if(order>=0&&order<4) {return 350;}
		else if(order>=4&&order<6) {return 550;}
		else if(order>=6&&order<8) {return 780;}
		else if(order==8) {return 1050;}
		else {return 0;}
	}
}
class PayUMoney extends Ware
{
	Scanner scan=new Scanner(System.in);
	public void purchase()
	{
		int got=choose(scan.nextInt());
		if(got!=0)
		{
			System.out.println("Tell us account balance: ");
			if(got<=scan.nextInt())
			{
				System.out.println("Item worth "+got+" has purchased");
			}
			else {System.out.println("Insufficient in your account");}
		}
		else
		{
			System.out.println("Invalid event selection");
		}
	}
}