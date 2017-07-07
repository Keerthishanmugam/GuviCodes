import java.io.*;
import java.util.*;

public class Subset {
public static void main(String args[])throws IOException
{
	int i,n1,n2;
	String s1,s2;
	boolean result;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of first array");
	n1=Integer.parseInt(br.readLine());
	System.out.println("Enter the first arrray elements");
	List<String>list1=new ArrayList<String>();
	for(i=0;i<n1;i++)
	{
		s1=br.readLine();
		list1.add(s1);
	}
	System.out.println("Enter the size of second array");
	n2=Integer.parseInt(br.readLine());
	System.out.println("Enter the second array elements");
	List<String>list2=new ArrayList<String>();
	for(i=0;i<n2;i++)
	{
		s2=br.readLine();
		list2.add(s2);
	}
	if(n1<n2)
	{
		
		//for(i=0;i<n1;i++)
	//	{
    result=	list2.containsAll(list1);
	//	}
	}
	else
	{
	 result=list1.containsAll(list2);
	}
	
	if(result==true)
	{
		System.out.println("It is subset");
	}
	else
	{
		System.out.println("It is not a subset");
	}
}
}
