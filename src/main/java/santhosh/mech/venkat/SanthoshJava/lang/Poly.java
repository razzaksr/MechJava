package santhosh.mech.venkat.SanthoshJava.lang;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Poly extends Santa
{
	
	@Override
	public void say() throws IOException, ArithmeticException {
		// TODO Auto-generated method stub
		System.out.println("Say polymorphism");
	}

	public static void main(String[] args) throws IOException 
	{
		Santa san=new Santa();san.hai();
		san.hey();Poly po=new Poly();po.say();
	}
}
class Santa
{
	public void hai()throws FileNotFoundException 
	{System.out.println("Simply hai");}
	public void hey()throws NumberFormatException
	{System.out.println("Listen");}
	public void say()throws IOException 
	{System.out.println("Say something");}
}