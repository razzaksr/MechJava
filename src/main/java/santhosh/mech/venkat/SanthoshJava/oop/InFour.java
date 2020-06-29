package santhosh.mech.venkat.SanthoshJava.oop;

import santhosh.mech.venkat.SanthoshJava.Jagged;

public class InFour 
{
	public static void main(String[] args) 
	{
		double[][] hai= {{1.2,5.6,3.1,9.1},{2.4,3.1}};
		Jagged jag=new Jagged();
		jag.report(hai);jag.order(hai);jag.report(hai);
		new Jagged().report(hai);
		new Jagged().order(hai);
		new Jagged().report(hai);
	}
}
