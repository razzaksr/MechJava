package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.Scanner;

public class RealTime extends Registrar
{
	public static void main(String[] args) 
	{
		RealTime time=new RealTime();
		Thread t1=new Thread(time,"Annamalai");
		Thread t2=new Thread(time,"Velupillai");
		Thread t3=new Thread(time,"Sathya");
		Thread t4=new Thread(time,"Victor");
		Thread t5=new Thread(time,"Razak");
		Thread t6=new Thread(time,"Murali");
		Thread t7=new Thread(time,"Mani");
		t1.start();t2.start();
		t3.start();t4.start();t5.start();t6.start();t7.start();
	}
}
class Registrar implements Runnable
{
	Scanner scan=new Scanner(System.in);
	double[] value;static int index=0;
	public Registrar() 
	{
		System.out.println("Tell us token count: ");
		value=new double[scan.nextInt()];
	}
	public double worth() 
	{
		double temp=0;
		for(double t:value) {temp+=t;}
		return temp;
	}
	@Override
	public void run() 
	{
		synchronized (scan) 
		{
			if(index<value.length)
			{
				System.out.println("Tell us value of the registration "+
						Thread.currentThread().getName());
							value[index]=scan.nextDouble();index++;
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" not today");
			}
			System.out.println(worth());
		}
		System.out.println("Registrar is busy");
	}
}