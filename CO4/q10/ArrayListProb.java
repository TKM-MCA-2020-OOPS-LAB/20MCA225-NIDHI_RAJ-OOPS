import java.util.*;
import java.io.*;
class ArrayListProb
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Apple");
		a.add("Mango");
		a.add("Jackfruit");
		a.add("Guava");
		a.add(3,"Pomogrante");
		for(String fruit:a)
		{
			System.out.println("The items in arraylist are:"+fruit);
		}
		
		System.out.println("\nThe item at index 4 is:"+a.get(4));
		a.set(4,"Lichi");
		System.out.println("The item at index 4 after altering:"+a.get(4));
		for(String fruit:a)
		{
			System.out.println("The items in arraylist are:"+fruit);
		}
		
		System.out.println("\nList after sorting:");
		Collections.sort(a);
		for(String fruit:a)
		{
			System.out.println("The items in arraylist are:"+fruit);
		}
		
		System.out.println("\nAfter removing element at 1:");
		a.remove(1);
		for(String fruit:a)
		{
			System.out.println("The items in arraylist are:"+fruit);
		}
		
		System.out.println("\nSize of arraylist is:"+a.size());
		
		System.out.println("\nClearing all elements");
		a.clear();
		for(String fruit:a)
		{
			System.out.println("The items in arraylist are:"+fruit);
		}
	}
}
		
		