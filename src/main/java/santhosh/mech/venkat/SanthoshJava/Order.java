package santhosh.mech.venkat.SanthoshJava;

public class Order 
{
	double[] price= {12.5,6.2,7.3,7.3,6.2,45.1,7.3};
	public void select()
	{
		for(int hold=0;hold<price.length;hold++)
		{
			for(int comp=hold+1;comp<price.length;comp++)
			{
				if(price[hold]>price[comp])
				{
					price[hold]*=price[comp];
					price[comp]=price[hold]/price[comp];
					price[hold]/=price[comp];
				}
			}
		}
	}
	public void bubble()
	{
		for(int hold=0;hold<price.length-1;hold++)
		{
			for(int comp=0;comp<price.length-hold-1;comp++)
			{
				if(price[comp]>price[comp+1])
				{
					price[comp]*=price[comp+1];
					price[comp+1]=price[comp]/price[comp+1];
					price[comp]/=price[comp+1];
				}
			}
		}
	}
	public void list()
	{
		for(double tmp:price)
		{System.out.println(tmp);}
	}
	public static void main(String[] args) 
	{
		Order od=new Order();
		od.bubble();//od.select();
		od.list();
	}
}
