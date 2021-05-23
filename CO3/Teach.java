import java.util.*;
class Person
{
	String name;
	String gender;
	String address;
	int age;
	
	public Person()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter gender:");
		gender=sc.next();
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
	}
}
class Employee extends Person
{
	int empid;
	String cmpnyname;
	String qualification;
	int sal;
	
	public Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		empid=sc.nextInt();
		System.out.println("Enter company name:");
		cmpnyname=sc.next();
		System.out.println("Enter qualification:");
		qualification=sc.next();
		System.out.println("Enter salary:");
		sal=sc.nextInt();
	}
}
class Teach extends Employee
{
	String subject;
	String dept;
	int tid;
	
	public Teach()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Teacher ID:");
		tid=sc.nextInt();
		System.out.println("Enter Department:");
		dept=sc.next();
		System.out.println("Enter Subject:");
		subject=sc.next();
	}
	
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Address:"+address);
		System.out.println("Age:"+age);
		System.out.println("Employee ID:"+empid);
		System.out.println("Company Name"+cmpnyname);
		System.out.println("Qualification:"+qualification);
		System.out.println("Salary:"+sal);
		System.out.println("Teacher ID:"+tid);
		System.out.println("Subject:"+subject);
		System.out.println("Department:"+dept);
	}
    
	public static void main(String args[])
	{
		Teach t[]=new Teach[2];
		for(int i=0;i<2;i++)
		{
			t[i]=new Teach();
		}
		for(int i=0;i<2;i++)
		{
			t[i].display();
		}
		
	}
}
		