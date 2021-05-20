import java.util.*;
class Employee
{
	int eid;
	String name;
	int sal;
	String Address;
	public Employee()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter eid:");
	 eid=sc.nextInt();
	 System.out.println("Enter ename:");
	 name=sc.next();
	 System.out.println("Enter salary:");
	 sal=sc.nextInt();
	 System.out.println("Enter address:");
	 Address=sc.next();
	}
}
class Teacher extends Employee
{
	String dept;
	String sub;
	public Teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter department:");
		dept=sc.next();
		System.out.println("enter subject:");
		sub=sc.next();
	}
	void display()
	{
		System.out.println("Employee ID:"+eid);
		System.out.println("Employee Name:"+name);
		System.out.println("Salary:"+sal);
		System.out.println("Address:"+Address);	
		System.out.println("Department:"+dept);
		System.out.println("Subject:"+sub);
	}
	public static void main(String args[])
	{
		Teacher[] t1=new Teacher[3];
		for(int i=0;i<3;i++)
	    {
		 t1[i]=new Teacher();
	    }
		for(int i=0;i<3;i++)
	    {
		 t1[i].display();
	    }
	}
}