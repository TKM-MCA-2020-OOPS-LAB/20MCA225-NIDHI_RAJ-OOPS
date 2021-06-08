package graphics.calculate;
public class Circle
{
	double r;
	public Circle(double rad)
	{
		r=rad;
	}
	public void ar()
	{
		double a=3.14*r*r;
		System.out.println("AREA OF CIRCLE IS:"+a);
	}
    public void p()
	{
		double per=2*3.14*r;
		System.out.println("PERIMETER OF CIRCLE IS:"+per);
	}
}