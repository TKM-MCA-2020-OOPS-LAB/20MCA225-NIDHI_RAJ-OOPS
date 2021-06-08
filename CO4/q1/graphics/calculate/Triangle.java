package graphics.calculate;
public class Triangle
{
	int b;
	int h;
	public Triangle(int base,int height)
	{
		b=base;
	    h=height;
	}
	public void areatri()
	{
		double area=0.5*b*h;
		System.out.println("AREA OF RECTANGLE IS:"+area);
	}
	
}
