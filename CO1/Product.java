public class Product
{
   String pcode;
   String pname;
   int price;
   
   public Product(String pc, String pn, int pri)
   {
	   this.pcode=pc;
	   this.pname=pn;
	   this.price=pri;
   }
   public int get()
   {
	   return this.price;
   }
   public void display()
   {
	   System.out.print("Product with highest price:"+"\n");
	   System.out.print("Code:"+pcode+"\n");
	   System.out.print("Name:"+pname+"\n");
	   System.out.print("Price:"+price+"\n");
   }

public static void main(String args[])
{

	Product p1=new Product("tv","TV",100);
	Product p2=new Product("fan","FAN",220);
	Product p3=new Product("inv","INVERTER",390);
	if((p1.price >= p2.price) && (p1.price >= p3.price))
	    p1.display();
	else if((p2.price >= p1.price) && (p2.price >= p3.price))
	        p2.display();
	else
		p3.display();

	
}
}