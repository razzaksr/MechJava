package santhosh.mech.venkat.SanthoshJava.oop;

import java.util.Arrays;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		Account acc1=new Account();
		acc1.setUsername("venkatsona");acc1.setPassword("sonacollege");
		acc1.setPin(636002);acc1.setKart(new String[] {"Hp pendrive"});
		acc1.setOrders(new String[] {"Redmi mobile"});
		System.out.println(acc1.getUsername()+" "+acc1.getPassword()+" "+
		acc1.getPin()+" ");
		System.out.println(Arrays.toString(acc1.getKart()));
		System.out.println(Arrays.toString(acc1.getOrders()));
		Account acc2=new Account("santhosh", "sona", new String[] {}, new String[] {}, 636004);
		System.out.println(acc2);
	}
}
