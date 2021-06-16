import java.util.*;
class mul extends Thread
{
	public void run()
	{
		System.out.println("Multiplication table of 5 is as follows:");
		for(int i=1;i<=10;i++)
		{
			int p=i*5;
			System.out.println(i+" * 5="+p);
		}
	}
}
class prime extends Thread
{
	public void run()
	{
		int n,i,j,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till which you want prime numbers");
		n=sc.nextInt();
		System.out.println("Prime numbers are:");    
		for(i=2;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
			{
					if(i%j==0)
					{
						c++;
					}
			}
         
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
	}
}
public class muleven
{
	public static void main(String args[])
	{
		mul m=new mul();
		m.start();
		prime p=new prime();
		p.start();
	}
}