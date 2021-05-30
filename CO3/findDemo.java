import java.util.*;
interface find
{
	public void area();
	public void perimeter();
}
class circle implements find
{
	double r;
	public circle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		r=sc.nextDouble();
	}
	public void area()
	{
		double a;
		a=3.14*r*r;
		System.out.println("Area of circle:"+a);
	}
	public void perimeter()
	{
		double p;
		p=2*3.14*r;
		System.out.println("Perimeter of circle:"+p);
	}
}
class rect implements find
{
	int l,b;
	public rect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth:");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	public void area()
	{
		int a;
		a=l*b;
		System.out.println("Area of circle:"+a);
	}
	public void perimeter()
	{
		int p;
		p=(2*(l+b));
		System.out.println("Perimeter of circle:"+p);
	}
}
class findDemo
{
	public static void main(String args[])
	{
		circle c=new circle();
		c.area();
		c.perimeter();
		rect r=new rect();
		r.area();
		r.perimeter();
	}
}