public class area
{
	void area(int x)
	{
		System.out.println("The area of sqaure is:"+Math.pow(x,2));
	}
	void area(int x,int y)
	{
		System.out.println("The area of rectangle is:"+x*y);
	}
	void area(int x,int y,int z)
	{
		System.out.println("The area of cuboid is:"+((2*x*y)+(2*y*z)+(2*x*z)));
	}
	public static void main(String args[])
	{
		area a=new area();
		a.area(4);
		a.area(2,3);
		a.area(2,3);
	}
}