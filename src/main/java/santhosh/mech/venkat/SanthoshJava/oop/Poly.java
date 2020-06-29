package santhosh.mech.venkat.SanthoshJava.oop;

public class Poly 
{
	int[][] sessions;
	public Poly() {}
	public Poly(int count,int stud) 
	{
		System.out.println(count+" Session scheduled for: "+stud);
		sessions=new int[count][stud];
	}
	public void iterate()
	{
		for(int[] staff:sessions)
		{
			for(int mark:staff) 
			{System.out.print(mark+" ");}
			System.out.println();
		}
	}
	public void shortlist(int cutoff)
	{
		System.out.println("Shortlisting based on: "+cutoff);
		for(int[] staff:sessions)
		{
			for(int mark:staff) 
			{
				if(mark>=cutoff) {System.out.print(mark+" ");}
			}
			System.out.println();
		}
	}
	public int shortlist()
	{
		int topper=0;
		System.out.println("Shortlisting to find topper");
		for(int[] staff:sessions)
		{
			for(int mark:staff) 
			{
				if(mark>=topper) {topper=mark;}
			}
		}
		return topper;
	}
	public void shortlist(int min,int max)
	{
		System.out.println("Shortlisting based on "+min+" and  "+max);
		for(int[] staff:sessions)
		{
			for(int mark:staff) 
			{
				if(mark>=min&&mark<=max) {System.out.print(mark+" ");}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Poly poly=new Poly(2,5);
		poly.sessions[0][0]=80;poly.sessions[0][1]=20;
		poly.sessions[0][2]=50;poly.sessions[0][3]=65;
		poly.sessions[0][4]=92;
		poly.sessions[1]= new int[]{10,40,35,90,20};
		poly.iterate();poly.shortlist(40);poly.shortlist(50, 70);
		System.out.println(poly.shortlist());
	}
}