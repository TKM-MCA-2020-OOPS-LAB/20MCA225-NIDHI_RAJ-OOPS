import java.util.*;
import java.lang.*;
public class symmetric
{
  public static void main(String args[])
  {
    int i,j,r,c;
	int[][] a=new int[10][10];
	int[][] trans=new int[10][10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter limits of array:(r,c)");
    r=sc.nextInt();
	c=sc.nextInt();
	System.out.println("Enter array elements:");
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			a[i][j]=sc.nextInt();
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			trans[i][j]=a[j][i];
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			if(trans[i][j]!=a[i][j])
			{
				System.out.println("The array you entered is not symmetric");
				System.exit(0);
			}
		}
	}
	System.out.println("The array you entered is symmetric");
  }
}

			
	