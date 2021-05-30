import java.util.*;
class Student
{
	int math;
	int chem;
	int phy;
	int comp;
	public Student()
	{
		math=93;
		chem=85;
		phy=75;
		comp=80;
	}
}
class Sports extends Student
{
	int goals;
	int matches;
	int won;
	public Sports()
	{
		goals=5;
		matches=4;
		won=3;
	}
}
class Result extends Sports
{
	void displayStud()
	{
		System.out.println("Academic details as follows:");
		System.out.println("=================");
		System.out.println("Maths:"+math);
		System.out.println("Chemistry:"+chem);;
		System.out.println("Physics:"+phy);
		System.out.println("Computer:"+comp);
	}
	void displaySport()
	{
		System.out.println("Sports details as follows:");
		System.out.println("=================");
		System.out.println("Goals:"+goals);
		System.out.println("Matches played:"+matches);;
		System.out.println("Games won:"+won);
    }
}
class resultdemo
{
	public static void main(String args[])
	{
		Student s=new Student();
		Sports sp=new Sports();
		Result r=new Result();
		r.displayStud();
		r.displaySport();
	}
}