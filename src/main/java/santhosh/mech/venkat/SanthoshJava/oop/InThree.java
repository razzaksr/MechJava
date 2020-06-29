package santhosh.mech.venkat.SanthoshJava.oop;

public class InThree 
{
	public static void main(String[] args) 
	{
		InThree three=new InThree();System.out.println(three.reaction(15));
	}
	public String reaction(int tips)
	{
		class Refer
		{
			String[] dishes= {"Kabab Chicken","Hyderabadi Biriyani","Sheshwan rice","Omlet","Egg Rice","Egg noodles"};
			public void select(int menu)
			{
				if(menu<dishes.length) {System.out.println(dishes[menu]);}
				else {System.out.println("Food not available");}
			}
		}
		Refer ref=new Refer();ref.select(2);
		if(tips<=5) {return "Useless";}
		else if(tips>=10&&tips<20) {return "Greetings";}
		else if(tips>=20) {return "Thank you and extra pan";}
		else {return "nothing";}
	}
}
