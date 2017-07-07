import java.io.*;
import java.util.*;
public class Repeatedi {
public static void main(String args[])throws IOException
{
	int i,a;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	List<String>list=new ArrayList<String>();
	Set<String>list1=new HashSet<String>();
	System.out.println("enter the value of n");
	int n=Integer.parseInt(br.readLine());
	System.out.println("Enter the rgister numbers"); 
	
   for(i=0;i<n;i++)
   {
	   String s=br.readLine();
	   list.add(s);
	 
   }
   for(String s1:list)
   {
	   a=Collections.frequency(list,s1);
	 
   if(a>=2)
   {
	   list1.add(s1);
   }
    
   }
	for(String s2:list1)
	{
	System.out.println(s2);
	}
}
}
