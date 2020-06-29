package santhosh.mech.venkat.SanthoshJava;

public class Arrange 
{
	public void list(char[] accept)
	{
		for(char temp:accept)
		{
			System.out.print(temp);
		}
	}
	public void insertion(char[] mind)
	{
		for(int hai=1;hai<mind.length;hai++)
		{
			int bye=hai;
			for(;bye>=0&&mind[bye-1]>mind[bye];bye--)
			{
				mind[bye-1]^=mind[bye];mind[bye]^=mind[bye-1];
				mind[bye-1]^=mind[bye];
			}
		}
	}
	public static void main(String[] args) 
	{
		char[] company= {'C','o','g','n','i','z','a','n','t'};
		Arrange arr=new Arrange();arr.list(company);
		arr.insertion(company);System.out.println();
		arr.list(company);
	}
}