import java.util.*;
class stringsort
{
	public static void main(String args[])
	{
		int s;
		Scanner sc=new Scanner(System.in);
		String str[]={"Afganisthan","South Korea","United States","Jamica","India","Somalia"};
		s=str.length;
		for(int i=0;i<s-1;i++)
		{
			for(int j=i+1;j<s;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(str));
	}
}