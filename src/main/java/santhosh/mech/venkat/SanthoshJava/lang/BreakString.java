package santhosh.mech.venkat.SanthoshJava.lang;

public class BreakString 
{
	public static void main(String[] args) 
	{
		String alpha=new String("  Covid19  ");// non-literal
		String beta="Covid19";// literal
		System.out.println(alpha+" "+alpha.length());
		System.out.println(beta+" "+beta.length());
		System.out.println(alpha.equals(beta));
		alpha.trim();// immutable
		System.out.println(alpha.compareTo(beta));
		alpha=alpha.trim();beta=beta.toLowerCase();
		System.out.println(alpha.compareToIgnoreCase(beta));
		System.out.println(beta.concat(" impacts in IT industry"));
		System.out.println(beta.endsWith("try"));
		alpha=alpha.concat(" is global pandemic");
		System.out.println(alpha.endsWith("mic"));
		System.out.println(beta.startsWith("c"));
		System.out.println(alpha.contains("global"));
		beta=beta.replace("19","2020" );
		System.out.println(beta);System.out.println(beta.getBytes());
		System.out.println(alpha.charAt(15));
		System.out.println(alpha.substring(10,15));
	}
}
