import java.util.*;
class even implements Runnable
{
	public void run()
	{
		System.out.println("Enter limit for printing even no's:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Even no's are:");
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
class fib implements Runnable
{
	public void run()
	{
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.println("Enter limit for printing fibanocci series:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Enter a +ve number");
		else
		{
			System.out.println("Fibanocci series is as follows:");
			while(n3<=n)
			{
				System.out.println(n1);
				n3=n1+n2;
				n1=n2;
				n2=n3;
			}
		}
	}
}
public class evenfib
{
	public static void main(String args[])
	{
		even e=new even();
		Thread t1=new Thread(e);
		t1.start();
		fib f=new fib();
		Thread t2=new Thread(f);
		t2.start();
	}
}