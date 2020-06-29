package santhosh.mech.venkat.SanthoshJava.lang;

public class NormalVsThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		shine sh=new shine();
		//sh.greet();
		Mist mt=new Mist();Thread t1=new Thread(mt,"Venkat");
		t1.setPriority(1);
		Thread t2=new Thread(mt,"Santhosh");t2.setPriority(7);
		Thread t3=new Thread(mt,"Subaash");t3.setPriority(2);
		Thread t4=new Thread(mt,"Victor");t4.setPriority(10);
		t1.start();t2.start();t3.start();t3.join();t4.start();
	}
}
class shine
{
	public void greet() {System.out.println("Be inevitable always");}
}
class Mist extends Thread
{
	public void react() {System.out.println("Positivity somethings comes off mind");}
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" "+
				Thread.currentThread().getPriority()+" "+
				Thread.currentThread().getId());
		react();
	}
}