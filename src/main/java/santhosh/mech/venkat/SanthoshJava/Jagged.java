package santhosh.mech.venkat.SanthoshJava;

public class Jagged 
{
	public void report(double[][] yet)
	{
		for(double[] floor:yet)
		{
			for(double pay:floor)
			{
				System.out.print(pay+" ");
			}
			System.out.println();
		}
	}
	public void order(double[][] venkat)
	{
		for(int floor=0;floor<venkat.length;floor++)
		{
			for(int times=0;times<venkat[floor].length-1;times++)
			{
				for(int comp=0;comp<venkat[floor].length-times-1;comp++)
				{
					if(venkat[floor][comp]>venkat[floor][comp+1])
					{
						venkat[floor][comp]*=venkat[floor][comp+1];
						venkat[floor][comp+1]=venkat[floor][comp]/venkat[floor][comp+1];
						venkat[floor][comp]/=venkat[floor][comp+1];
					}
				}
			}
		}
		System.out.println("Sorting done by Bubble algorithm");
	}
	public static void main(String[] args) 
	{
		Jagged jag=new Jagged();
		double[][] rent=new double[3][];
		rent[0]= new double[] {4.5,9.5,3.5};
		rent[1]= new double[] {12.5,5.5};
		rent[2]= new double[] {9.5,10.9,4.5,2.5,7.2};
		jag.report(rent);jag.order(rent);jag.report(rent);
	}
}