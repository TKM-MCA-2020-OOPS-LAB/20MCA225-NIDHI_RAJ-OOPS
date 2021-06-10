import java.util.*;
class NegException extends Exception
{
	public NegException(String msg)
	{
		super(msg);
	}
}
public class avg
{
	public static void main(String args[])throws NegException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int[] a=new int[10];
		int n=sc.nextInt();
		try
		{
			System.out.println("Enter the numbers:");
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if(a[i]<0)
				{
					throw new NegException("One of the numbers id negetive,can't find average");
				}
			}
					int avrg=0;
					for(int j=0;j<n;j++)
					{
						avrg+=a[j];
					}
					System.out.println("Average is:"+avrg);
		}
		catch(NegException e)
		{
			System.out.println("NEGETIVE EXCEPTION OCCURED:"+e);
		}
	}
}
		