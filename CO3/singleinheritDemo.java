import java.util.*;
class Publisher
{
	String pname;
	int pid;
	
	public Publisher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter publisher name:");
		pname=sc.next();
		System.out.println("Enter publisher ID:");
		pid=sc.nextInt();
	}
}
class Book extends Publisher
{
	int nop;
	int price;
	
	public Book()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price:");
		price=sc.nextInt();
		System.out.println("Enter no: of pages:");
		nop=sc.nextInt();
	}
}
class literature extends Book
{
	
	String title;
	String author;
	
	public literature(String t,String a)
	{
		title=t;
		author=a;
	}
	public void show()
	{
		System.out.println("Publisher name:"+pname);
		System.out.println("Publisher ID:"+pid);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println("Title:"+title);
		System.out.println("No of Pages:"+nop);
	}
}
class fiction extends Book 
{

	String bname;
	String auth;
	
    public fiction(String a,String b)
	{
		bname=a;
		auth=b;
	}
	public void display()
	{
		System.out.println("Publisher name:"+pname);
		System.out.println("Publisher ID:"+pid);
		System.out.println("Author:"+auth);
		System.out.println("Cost:"+price);
		System.out.println("Book name:"+bname);
		System.out.println("No of Pages:"+nop);
	}
}
class singleinheritDemo
{
	public static void main(String args[])
	{
		System.out.println("Genre of book");
		System.out.println("=============");
		System.out.println("1.Literature");
		System.out.println("2.Fiction");
		System.out.println("Enter choice:");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter literature book details:");
				literature l=new literature("Two States","Chethan Bhagath");
				l.show();
				break;
			case 2:
				System.out.println("Enter fictional book details:");
				fiction f=new fiction("Stranger Trilogy","Novoneel Chakraborthy");
				f.display();
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
		}
		
		
	}
}
		