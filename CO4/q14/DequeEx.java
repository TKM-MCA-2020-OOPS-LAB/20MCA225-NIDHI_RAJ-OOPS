import java.util.*;

public class DequeEx
{
	public static void main(String[] args)
	{
		Deque<String> d
			= new LinkedList<String>();


		d.add("one");

		d.addFirst("two");

		d.addLast("three");

		d.push("four");

		d.offer("five");

		d.offerFirst("six");

		System.out.println(d + "\n");

		d.removeFirst();
		d.removeLast();
		System.out.println("Deque after removing "
						+ "first and last: "
						+ d);
	}
}
