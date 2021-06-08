package graphics.calculate;
public class Square
{
	int a;
	public Square(int side)
	{
		a=side;
	}
	public void areasq()
	{
		int area=a*a;
		System.out.println("AREA OF RECTANGLE IS:"+area);
	}
	public void perisq()
	{
		int p=4*a;
		System.out.println("PERIMETER OF RECTANGLE IS:"+p);
	}
}
