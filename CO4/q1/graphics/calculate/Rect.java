package graphics.calculate;
public class Rect
{
	int l;
	int b;
	public Rect(int len,int bre)
	{
		l=len;
		b=bre;
	}
	public void area()
	{
		int area=l*b;
		System.out.println("AREA OF RECTANGLE IS:"+area);
	}
	public void peri()
	{
		int p=2*(l+b);
		System.out.println("PERIMETER OF RECTANGLE IS:"+p);
	}
}
