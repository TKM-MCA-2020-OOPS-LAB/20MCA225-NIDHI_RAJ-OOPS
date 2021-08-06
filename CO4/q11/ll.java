import java.util.*;
class ll
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 4 student names:");
	String [][] str = new String[4][1];
	for(int i=0;i<4;i++)
		for(int j=0;j<1;j++)
			str[i][j]=sc.nextLine();
	LinkedList<String> student=new LinkedList<String>();
	for(int i=0;i<4;i++)
		for(int j=0;j<1;j++)
			student.add(str[i][j]);
	
	System.out.println("The names are:");
	Iterator<String> i=student.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

}
}