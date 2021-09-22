import java.net.*;
import java.io.*;

public class Client 
{
	public static void main(String args[]) throws Exception
	{
		try 
		{
			Socket s = new Socket ("localhost", 1234);
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			pw.println("Are you okay ?");
			
			
		//Client is reading from its InputStream	
			InputStreamReader isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String str= br.readLine();
			System.out.println("Message from Server: "+str);
			br.flush();
			pw.close();
			s.close();					
		}
		catch(Exception e)
		{
			System.out.println("An error occured..." +e);	
		}
	}
}