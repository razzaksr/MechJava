package santhosh.mech.venkat.SanthoshJava;

import java.util.Scanner;

public class Make 
{
	double[] price= {12.5,9.2,7.3,7.1,6.2,45.1,89.3};
	public void display()
	{
		for(double temp:price)
		{
			System.out.println(temp);
		}
	}
	public void findAlter(double mine)
	{
		for(int index=0;index<price.length;index++)
		{
			if(price[index]>=mine)
			{
				price[index]-=(price[index]*10)/100;
			}
		}
	}
	public void reverse()
	{
		int begin=0,end=price.length-1;
		while(begin<end)
		{
			price[begin]*=price[end];
			price[end]=price[begin]/price[end];
			price[begin]/=price[end];
			begin++;end--;
		}
	}
	public static void main(String[] args) 
	{
		Make mk=new Make();
		mk.display();
		mk.reverse();
		System.out.println("After reveresed");mk.display();
		/*double min=mk.price[0];double max=mk.price[0];
		for(double temp:mk.price)
		{
			if(temp<min) {min=temp;}
			if(temp>max) {max=temp;}
		}
		System.out.println("Min value is: "+min);
		System.out.println("Max value is: "+max);
		
		int pos1=0,pos2=0;
		for(int index=0;index<mk.price.length;index++)
		{
			if(mk.price[index]==min) {pos1=index;}
			if(mk.price[index]==max) {pos2=index;}
		}
		
		System.out.println(pos1+" "+pos2);
		double temp=mk.price[pos1];
		mk.price[pos1]=mk.price[pos2];
		mk.price[pos2]=temp;
		mk.price[pos1]*=mk.price[pos2];
		mk.price[pos2]=mk.price[pos1]/mk.price[pos2];
		mk.price[pos1]/=mk.price[pos2];
		
		mk.display();*/
		/*Scanner scan=new Scanner(System.in);
		mk.display();
		mk.findAlter(scan.nextDouble());
		System.out.println("After Discount");
		mk.display();
		scan.close();*/
	}
}
