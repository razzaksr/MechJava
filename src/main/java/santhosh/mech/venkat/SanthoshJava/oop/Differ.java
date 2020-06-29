package santhosh.mech.venkat.SanthoshJava.oop;

public class Differ extends SomeHow implements Shine
{
	public static void main(String[] args) 
	{
		Differ dif=new Differ();dif.cast();
		dif.yet[0]=119;dif.cast();
		dif.set[0]='Q';dif.set[1]='T';
		for(char wind:dif.set) {System.out.println(wind);}
		System.out.println(dif.data);dif.react();
		Shine.bitwise();
	}
}
interface Shine
{
	char[] set= {'W','t','s','R','m','D'};
	int data=90;
	public default void react()
	{
		for(char temp:set) {System.out.println((char)(temp+1));}
	}
	public static void bitwise() {System.out.println("Static interface method");}
	
}
class SomeHow
{
	byte[] yet= {65,98,120,71,87,91};
	// non abstract: method with definition
	public void cast() {
		for(byte temp:yet) {System.out.println((char)temp);}
	}
}