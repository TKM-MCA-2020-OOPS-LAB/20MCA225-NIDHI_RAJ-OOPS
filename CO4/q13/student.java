import java.util.*;
public class student
{
    public static void main(String[] args) 
	{
		PriorityQueue<String> stud=new PriorityQueue<String>();  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of elements ");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		for(int i =0;i<n;i++)
		{
			String st=sc.next();
			stud.add(st);
	 
		}
		System.out.println("head:"+stud.element());  
		System.out.println("head:"+stud.peek());  
		System.out.println("Iterating the queue elements\n ");  
		Iterator itr=stud.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		stud.remove();  
		stud.poll();  
		System.out.println("After changing elements the queue becomes:\n");  
		Iterator<String> itr2=stud.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
}