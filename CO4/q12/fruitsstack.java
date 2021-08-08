import java.util.*;
public class fruitsstack 
{
	public static void main(String args[])
	{

		Stack<String> fruits = new Stack<String>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Guava");

		System.out.println("Stack: " + fruits);

		String rem_ele = fruits.remove(0);

		System.out.println("Removed element: "
						+ rem_ele);

		System.out.println("Final Stack: "
						+ fruits);
	}
}
