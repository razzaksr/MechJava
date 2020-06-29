package santhosh.mech.venkat.SanthoshJava.oop;

public class Derive extends Charges
{
	public static void main(String[] args) 
	{
		Statement state=new Statement();
		//state.list();
		state.select(4000);
		Derive charg=new Derive();
		charg.check();
	}
}
class Transaction
{
	double[] yet= {1000,4000,2000,10000,4500,1000,6000,4900,10200,4000};
}
class Statement extends Transaction
{
	public void list()
	{
		for(double temp:yet) {System.out.println(temp);}
	}
	public void select(int fix)
	{
		for(double temp:yet) {if(temp>=fix) {System.out.println(temp);}}
	}
}
class Charges extends Transaction
{
	public void check()
	{
		int count=0;
		for(int index=0;index<yet.length-1;index++)
		{
			if(yet[index]>yet[index+1])
			{
				count++;
			}
		}
		System.out.println("No of debits: "+count);
		if(count>3)
		{
			System.out.println("Charges gonna deducted from account is: "+
					(count-3)*20);
			System.out.println("Remaining balance: "+(yet[yet.length-1]-((count-3)*20)));
		}
	}
}