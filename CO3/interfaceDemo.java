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
interface Book 
{
	public void get();
	public void show();
	
}
class literature extends Publisher implements Book 
{
	int price;
	String title;
	String author;
	
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter price:");
		price=sc.nextInt();
		System.out.println("Enter title:");
		title=sc.next();
		System.out.println("Enter author:");
		author=sc.next();
	}
	public void show()
	{
		System.out.println("Publisher name:"+pname);
		System.out.println("Publisher ID:"+pid);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
		System.out.println("Title:"+title);
	}
}
class fiction extends Publisher implements Book 
{
	int cost;
	String bname;
	String auth;
	
    public void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost:");
		cost=sc.nextInt();
		System.out.println("Enter book name:");
		bname=sc.next();
		System.out.println("Enter author:");
		auth=sc.next();
	}
	public void show()
	{
		System.out.println("Publisher name:"+pname);
		System.out.println("Publisher ID:"+pid);
		System.out.println("Author:"+auth);
		System.out.println("Cost:"+cost);
		System.out.println("Book name:"+bname);
	}
}
class interfaceDemo
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
				literature l=new literature();
				l.get();
				l.show();
				break;
			case 2:
				System.out.println("Enter fictional book details:");
				fiction f=new fiction();
				f.get();
				f.show();
				break;
			default:
				System.out.println("Enter a valid choice");
				break;
		}
		
		
	}
}
		