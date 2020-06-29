package santhosh.mech.venkat.SanthoshJava;

public class Members 
{
	public static void main(String[] args) 
	{
		Store str=new Store();str.search(90);str.search(77);
		for(int temp:str.hai)
		{
			System.out.println(temp);
		}
	}
}
class Store
{
	int[] hai= {12,45,90,12,45,'Z'};boolean just;
	public void search(int data)//90
	{
		int index;just=false;
		for(index=0;index<hai.length;index++)
		{
			if(hai[index]==data) 
			{System.out.println(data+" presents in "+index);just=true;break;}
		}
		if(just==true) {System.out.println(index);}
		else {System.out.println(data+" not available");}
	}
}