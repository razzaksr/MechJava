package santhosh.mech.venkat.SanthoshJava;

import java.util.Scanner;

public class Multi 
{
	public void list(int[][] hai)
	{
		for(int[] floor:hai)
		{
			for(int pc:floor)
			{
				System.out.print(pc+" ");
			}
			System.out.println();
		}
	}
	public void findLab(int[][] pcs,int people)
	{
		int min=Integer.MAX_VALUE, mFloor=0,mLab=0;
		for(int floor=0;floor<pcs.length;floor++)
		{
			for(int lab=0;lab<pcs[floor].length;lab++)
			{
				if(people<=pcs[floor][lab])
				{
					if(min>pcs[floor][lab])
					{
						min=pcs[floor][lab];
						mFloor=floor;mLab=lab;
					}
				}
			}
		}
		if(min!=Integer.MAX_VALUE)
		{System.out.println("Lab "+mFloor+" and "+mLab+" matched of capacity "+min);}
		else {System.out.println("None matched");}
	}
	public static void main(String[] args) 
	{
		int[][] labs= {{25,67,19},{35,26,45}};
		//int[][] labs=new int[2][3];
		Multi mul=new Multi();mul.list(labs);
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us how many person's gonna write online test: ");
		mul.findLab(labs, scan.nextInt());
	}
}