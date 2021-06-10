import java.util.regex.*;
import java.util.Scanner;
class usernameex extends Exception
{
	public usernameex(String message)
	{
		super(message);
	}
}
class passwordex extends Exception
{
	public passwordex(String msg)
	{
		super(msg);
	}
}
public class userexemp
{
	public static void main(String args[]) throws usernameex,passwordex
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String u=sc.next();
		System.out.println("Enter password:");
		String pas=sc.next();
		try
		{
			if(u=="")
        			 throw new usernameex("Username can't be empty");
        	 if(pas=="")
        		 throw new passwordex("password  can't be empty");
        	 if (!(pas.contains("@") || pas.contains("#")
                     || pas.contains("!") || pas.contains("~")
                     || pas.contains("$") || pas.contains("%")
                     || pas.contains("^") || pas.contains("&")
                     || pas.contains("*") || pas.contains("(")
                     || pas.contains(")") || pas.contains("-")
                     || pas.contains("+") || pas.contains("/")
                     || pas.contains(":") || pas.contains(".")
                     || pas.contains(", ") || pas.contains("<")
                     || pas.contains(">") || pas.contains("?")
                     || pas.contains("|"))) {
                   throw new passwordex("password must contain any special character");
               }
        	 else if (u.length()<=5) 
        		 throw new usernameex("Username must be greater than 5 characters!");
        	 
        	 else if (pas.length()<8) {
        		 throw new passwordex("Please enter a strong password");
        	 }
		}
		catch(usernameex e)
		{
			System.out.println("USERNAME EXCEPTION OCCURED:"+e);
		}
		catch(passwordex e)
		{
			System.out.println("PASSWORD EXCEPTION OCCURED:"+e);
		}
	}
}
			
		

