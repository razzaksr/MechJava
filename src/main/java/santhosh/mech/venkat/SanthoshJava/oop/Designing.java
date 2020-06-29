package santhosh.mech.venkat.SanthoshJava.oop;

public class Designing 
{
	String[] skill;
	public Designing() // default constructor
	{System.out.println("Hi all welcome");skill=new String[4];}
	public Designing(int size) {System.out.println("Size allocation");
	skill=new String[size];}
	public Designing(String[] yet)
	{System.out.println("Copy one array to another");skill=yet;}
	public void list()
	{
		for(String tmp:skill)
		{System.out.println(tmp);}
	}
	public void bubble()
	{
		String temp;
		for(int hold=0;hold<skill.length-1;hold++)
		{
			for(int comp=0;comp<skill.length-hold-1;comp++)
			{
				if(skill[comp].compareTo(skill[comp+1])>0)
				{
					temp=skill[comp];
					skill[comp]=skill[comp+1];
					skill[comp+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Designing des=new Designing();
		des.skill[0]="Java";des.skill[1]="Python";des.skill[2]="Go";
		des.skill[3]="Ruby";des.bubble();des.list();
		Designing des1=new Designing(7);
		des1.skill[0]="Cloud";des1.skill[1]="R";des1.skill[2]="AI";
		des1.skill[3]="Perl";des1.skill[4]="Spring";des1.skill[5]="Hibernate";
		des1.skill[6]="AWS";des1.bubble();des1.list();
		Designing des2=new Designing(new String[] {"Java","Python"});
		des2.bubble();des2.list();
	}
}