package santhosh.mech.venkat.SanthoshJava;

public class Extras 
{
	double[] price= {12.5,6.2,7.3,7.3,6.2,45.1,7.3};
	public void findDup()
	{
		double temp=0.0;
		for(int hold=0;hold<price.length;hold++)
		{
			for(int comp=hold+1;comp<price.length;comp++)
			{
				if(price[hold]==price[comp]&&price[hold]!=temp)
				{
					System.out.println(price[hold]+" is duplicated in "+hold+" and "+comp);
					temp=price[hold];
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Extras ext=new Extras();
		ext.findDup();
	}
}
