package santhosh.mech.venkat.SanthoshJava.lang;

public class Morethan 
{
	public static void main(String[] args) 
	{
		Fibo fib=new Fibo(10);
		Prime pre=new Prime(20);
		Thread t1=new Thread(fib,"Alan");
		Thread t2=new Thread(pre,"Sam");
		Thread t3=new Thread(fib,"Linga");
		Thread t4=new Thread(pre,"Richard");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Fibo implements Runnable
{
	int limit, num1=0,num2=1,sum;
	public Fibo(int temp) 
	{limit=temp;}
	@Override
	public void run() 
	{
		synchronized (this)
		{
			System.out.println(Thread.currentThread().getName()+" generating fibonacci series");
			if(limit>=2)
			{
				System.out.println(num1+"\n"+num2);
				for(int hai=3;hai<=limit;hai++)
				{
					sum=num1+num2;num1=num2;num2=sum;
					System.out.println(sum);
				}
			}else {System.out.println("Can't generate");}
		}
	}
}
class Prime implements Runnable
{
	int cap;
	public Prime(int size) {cap=size;}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		synchronized (this)
		{
			System.out.println(Thread.currentThread().getName()+" generating prime numbers");
			for(int num=2;num<=cap;num++)
			{
				if(num==2||num==3||num==5||num==7||num%2!=0&&num%3!=0&&num%5!=0
						&&num%7!=0)
				{
					System.out.println(num);
				}
			}
		}
	}
}