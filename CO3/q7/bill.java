import java.util.*;
interface calculatedemo
{
	public void calculate();
}
class billcalc implements calculatedemo
{
	public void calculate()
	{
		int oid=1001;
		System.out.println("							BILL								");
		System.out.println("							====								");
		System.out.println("Order No."+oid);
		System.out.println("Date:"+java.time.LocalDate.now());
		System.out.println("Product id		Name		Quantity		Unit Price		Total");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("101			A			2		25			50");
		System.out.println("102			B			1		100			100");
		System.out.println("___________________________________________________________________________________________");
		System.out.println("								     Net Amount		150");
	}
}
class bill
{
	public static void main(String args[])
	{
		billcalc b=new billcalc();
		b.calculate();
	}
}