import java.util.*;
class arrayofobj
{
 int eno;
 String ename;
 int esalary;
 Scanner sc=new Scanner(System.in);
 
 void getdetails()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter eno:");
	 this.eno=sc.nextInt();
	 System.out.println("Enter ename:");
	 this.ename=sc.nextLine();
	 System.out.println("Enter esalary:");
	 this.esalary=sc.nextInt();
 }
 void display()
 {
	 System.out.println("Employee no:"+this.eno);
	 System.out.println("Employee name:"+this.ename);
	 System.out.println("Employee Salary:"+this.esalary);
 }
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 arrayofobj[] a1=new arrayofobj[5];
	 int f=0;
	 for(int i=0;i<5;i++)
	 {
		 a1[i]=new arrayofobj();
		 a1[i].getdetails();
	 }
	 System.out.println("Enter the id to be searched:");
	 int id=sc.nextInt();
	 for(int i=0;i<5;i++)
	 {
		 if(id==a1[i].eno)
		 {
			 a1[i].display();
			 break;
		 }
		 else
			 f++;
	 }
	if(f!=0)
      System.out.println("No match is found");  
 }
}
	
 