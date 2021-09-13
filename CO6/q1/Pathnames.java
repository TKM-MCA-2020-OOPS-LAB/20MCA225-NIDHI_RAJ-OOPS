import java.io.File;
import java.io.*;
import java.util.*;
public class Pathnames 
{

    public static void main(String[] args)
	{
        String[] pathnames;     
        File f = new File("C:\\Users\\USER\\Desktop\\File");
        pathnames = f.list();
        for (String pathname : pathnames) 
		{
          
            System.out.println(pathname);
        }
		System.out.println("Enter the file to be searched.. " );
		Scanner sc=new Scanner(System.in);
        String name = sc.next();
		File[] list = f.listFiles();
        if(list!=null)
        for (File fil : list)
        {
			if (name.equalsIgnoreCase(fil.getName()))
			{
                System.out.println("Yes");
			}
			else
			{
			    System.out.println("No");
			}	
		}
    }
}