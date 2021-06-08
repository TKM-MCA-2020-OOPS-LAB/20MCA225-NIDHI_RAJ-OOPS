import java.util.*;
import graphics.calculate.*;
public class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sides of rectangle:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		Rect r=new Rect(length,breadth);
		r.area();
		r.peri();
		System.out.println("Enter the radius of circle:");
		double radius=sc.nextDouble();
		Circle c=new Circle(radius);
		c.ar();
		c.p();
		System.out.println("Enter the side of sqaure:");
		int a=sc.nextInt();
		Square s=new Square(a);
		s.areasq();
		s.perisq();
		System.out.println("Enter the b & h of triangle:");
		int b=sc.nextInt();
		int h=sc.nextInt();
		Triangle t=new Triangle(b,h);
		t.areatri();
	}
}