import java.io.*;
public class Workingday {
	public static void main(String args[]) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the day");
	String day=br.readLine();
    day=day.toLowerCase();
	 if(day.equals("sunday"))
	{
		System.out.println("false");
	}
	else
	{
		System.out.println("true");
	}
		}
	
	
	}


