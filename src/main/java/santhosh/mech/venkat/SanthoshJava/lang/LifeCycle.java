package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class LifeCycle 
{
	public static void main(String[] args) 
	{
		Org org=new Org();
		Thread t1=new Thread(org,"Sundar");
		Thread t2=new Thread(org,"Sivam");
		Thread t3=new Thread(org,"Sathya");
		Thread t4=new Thread(org,"Adani");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Org implements Runnable
{
	int[][] data= {{12,8,0,1},{4,1,9},{1,7,3,0,1},{12,4,8,3},{6,3},{1,3,9}};
	Scanner scan=new Scanner(System.in);
	public void shortlist(int min,int max)
	{
		if(Thread.currentThread().getName().equals("Sundar"))
		{
			System.out.println(Thread.currentThread().getName()+", we Can't support you");
			Thread.currentThread().stop();
		}
		for(int row=0;row<data.length;row++)
		{
			for(int col=0;col<data[row].length;col++)
			{
				if(data[row][col]>=min&&data[row][col]<=max)
				{
					System.out.println(data[row][col]+" exists @ "+row+" and "+col);
				}
			}
		}
	}
	@Override
	public void run() 
	{
		synchronized (data) 
		{
			System.out.println("Welcome BDE "+Thread.currentThread().getName());
			if(Thread.currentThread().getName().equals("Sivam"))
			{
				System.out.println(Thread.currentThread().getName()+" please wait for a while");
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			shortlist(scan.nextInt(), scan.nextInt());
		}
	}
}