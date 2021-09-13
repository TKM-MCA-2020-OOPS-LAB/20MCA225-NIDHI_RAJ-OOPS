import java.io.FileWriter;
import java.io.IOException;
public class WriteReadFile 
{
 
    public static void main(String[] args) 
	{
        try 
		{
            FileWriter writer = new FileWriter("C:\\Users\\USER\\Desktop\\File\\fileone.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   
            writer.write("Good Bye!");
            writer.close();
			System.out.println("Data is written");
        }
		catch (IOException e) 
		{
            e.printStackTrace();
        }
 
    }
 
}