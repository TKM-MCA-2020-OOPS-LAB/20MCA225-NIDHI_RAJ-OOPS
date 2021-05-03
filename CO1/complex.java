import java.util.*;
public class complex
{
	int real;
	int img;
	Scanner sc=new Scanner(System.in);
	 public complex(int r,int i)
	 {
		 this.real=r;
		 this.img=i;
	 }
	 public static complex add(complex c1, complex c2)
	 {
		 complex c3=new complex(0,0);
		 c3.real=c1.real + c2.real;
		 c3.img=c1.img+c2.img;
		 return c3;
	 }
	 void display()
	 {
		 System.out.println("The complex no is:");
		 System.out.println(this.real+"+"+this.img+"i");
	 }
	 public static void main(String args[])
	 {
		 System.out.println("Enter the first complex no:");
		 complex a=new complex(1,3);
		 a.display();
		 System.out.println("Enter the second complex no:");
		 complex b=new complex(4,5);
		 b.display();
		 complex c=add(a,b);
		 c.display();
	 }
		 
}		 
	