import java.io.*;
import java.util.*;
public class SquarePoints {
public static void main(String args[])throws IOException
{
	int count=0;
	String points;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String>list=new ArrayList<String>();
	System.out.println("Enter the points");
	points=br.readLine();
	points=points.replace("(","");
	points=points.replace(")",",");
	String[] numbers=points.split(",");
    
	for(String s:numbers)
	{
		list.add(s);
	}

	for(String a:numbers)
	{
	int i=Collections.frequency(list,a);
	
	if(i>=2)
	{
		count++;
		
	}
	else
	{
		System.out.println("Not square");
		break;
		
	}
	}
	if(count==8)
	{
		System.out.println("square");
	}
}
}
