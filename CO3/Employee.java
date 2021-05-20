import java.util.*;
public class Employee
{
	int empid;
	String name;
	int sal;
	String Address;
	public Employee(int eid, String n,int salary, String add)
	{
		empid=eid;
		name=n;
		sal=salary;
		Address=add;
	}
		void getdetails()
   {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter eid:");
	 this.eid=sc.nextInt();
	 System.out.println("Enter ename:");
	 this.name=sc.nextLine();
	 System.out.println("Enter salary:");
	 this.sal=sc.nextInt();
	 System.out.println("Enter address:");
	 this.Address=sc.nextLine();
    }
	void putdetails()
	{
	    System.out.println("Employee ID:"+super.eid);
		System.out.println("Employee Name:"+super.name);
		System.out.println("Salary:"+super.sal);
		System.out.println("Address:"+super.Address);	
	}
}
public class Teacher extends Employee
{
	String dept;
	String sub;
	public Teacher(int eid,String n,int salary,String add,String dep,String subject)
	{
		super(eid,n,salary,add);
		dept=dep;
		subject=sub;
	}
	void display()
	{
		super.putdetails();
		System.out.println("Department:"+dept);
		System.out.println("Subject:"+sub);
	}
	void details()
 {
	 super.getdetails()
	 this.eid=sc.nextInt();
	 System.out.println("Enter dept:");
	 this.dept=sc.nextLine();
	 System.out.println("Enter subject taught:");
	 this.sub=sc.nextLine();
 }
}
public class EmployeeDemo
{
	public static void main(String args[])
	{
		Teacher[] t1=new Teacher[3];
		for(int i=0;i<5;i++)
	    {
		 t1[i]=new Teacher();
		 t1[i].details();
	    }