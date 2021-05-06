import java.util.*;
public class search
{
  public static void main(String args[])
  {
		int[] array=new int[10];
		System.out.println("Enter limit");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<s;i++)
			array[i]=sc.nextInt();
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				if(array[j]>array[i])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<s;i++)
			System.out.println(array[i]+"\n");
  }
}