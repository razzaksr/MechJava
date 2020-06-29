package santhosh.mech.venkat.SanthoshJava.lang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepTest 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);int index1=0,index2=0,row=0,col=0;
		int[][] collect= {{2,4,19,20},{12,0,56,89,0},{1,7,8},{10,0,4,8,3,9,12,0}};
		try
		{
			System.out.println("Tell us first num row and col: ");
			index1=scan.nextInt();index2=scan.nextInt();
			System.out.println("Tell us second num row and col: ");
			row=scan.nextInt();col=scan.nextInt();
			System.out.println(collect[index1][index2]/collect[row][col]);
		}
		catch(InputMismatchException ins)
		{
			Scanner get=new Scanner(System.in);
			System.out.println(ins+"\nEnter only numeric");
			System.out.println("Tell us first num row and col: ");
			index1=get.nextInt();index2=get.nextInt();
			System.out.println("Tell us second num row and col: ");
			row=get.nextInt();col=get.nextInt();
			System.out.println(collect[index1][index2]/collect[row][col]);
			get.close();
		}
		catch(ArrayIndexOutOfBoundsException arr)
		{
			System.out.println(arr+"\nPlease specify the row index within: "+
		collect.length+"\nspecify the column index within: "+collect.length);
			System.out.println("Tell us first num row and col: ");
			index1=scan.nextInt();index2=scan.nextInt();
			System.out.println("Tell us second num row and col: ");
			row=scan.nextInt();col=scan.nextInt();
			System.out.println(collect[index1][index2]/collect[row][col]);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"Choose non zero element");
			System.out.println("Tell us second num row and col: ");
			row=scan.nextInt();col=scan.nextInt();
			System.out.println(collect[index1][index2]/collect[row][col]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Operation done");
		}
		scan.close();
	}
}