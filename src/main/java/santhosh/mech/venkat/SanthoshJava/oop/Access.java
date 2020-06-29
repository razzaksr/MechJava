package santhosh.mech.venkat.SanthoshJava.oop;

public class Access 
{
	public static void main(String[] args) 
	{
		Sourcing src1=new Sourcing();
		Sourcing src2=new Sourcing();
		src1.skill[0]="Java";src1.skill[1]="Python";src1.skill[2]="Go";
		src1.skill[3]="Ruby";src1.skill[4]="C";
		src1.display();
		src1.campus="Cognizant";System.out.println(src1.campus);
		//Sourcing.campus="Cognizant";System.out.println(Sourcing.campus);
		src2.skill[0]="C#";src2.skill[1]="Java";src2.skill[2]="Assembly";
		src2.skill[3]="Perl";src2.skill[4]="C++";
		src2.display();
		src2.campus="Infoview";System.out.println(src2.campus);
		//Sourcing.campus="Infoview";System.out.println(Sourcing.campus);
		System.out.println("Src1's campus is: "+src1.campus);
		//System.out.println("Src1's campus is: "+Sourcing.campus);
		src1.display();
	}
}
