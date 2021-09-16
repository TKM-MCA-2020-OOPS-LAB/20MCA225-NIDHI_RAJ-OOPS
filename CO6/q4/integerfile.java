import java.io.*;
import java.io.IOException;
import java.util.*;
public class integerfile
{
 
    public static void main(String[] args) throws Exception
	{
      
			File f = new File("C:\\Users\\USER\\Desktop\\File\\filefour.txt");
            FileWriter writer = new FileWriter(f);
            writer.write("1");
            writer.write("\r\n");   
            writer.write("2");
			writer.write("\r\n");
			writer.write("3");
            writer.write("\r\n");
			writer.write("4");
            writer.write("\r\n");
			writer.write("5");
            writer.write("\r\n");
            writer.close();
			System.out.println("Data is written");
			FileReader fin = new FileReader(f);
			FileOutputStream ewrite = new FileOutputStream("C:\\Users\\USER\\Desktop\\File\\even.txt");
			FileOutputStream owrite = new FileOutputStream("C:\\Users\\USER\\Desktop\\File\\odd.txt");
			int c;  
			while ((c = fin.read())!=  -1) 
			{  
				if(c%2==0)
				{
					   ewrite.write(c);
				}
				else
				{
					owrite.write(c);
				}
			}  
			System.out.println("Transfer complete");  
			ewrite.close();  
			owrite.close();  
 
    }
 
}