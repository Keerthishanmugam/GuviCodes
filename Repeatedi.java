import java.io.*;
import java.util.*;
public class Repeatedi {
public static void main(String args[])throws IOException
{
	int i,a;
	String s=null;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	List<String>list=new ArrayList<String>();
	Set<String>list1=new HashSet<String>();
	System.out.println("enter the value of n");
	int n=Integer.parseInt(br.readLine());
	System.out.println("Enter the rgister numbers"); 
	
   for(i=0;i<n;i++)
   {
	    s=br.readLine();
	   list.add(s);
	 
   }
	if(n>1)
	{
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
	else
	{
		System.out.println(s);
}
}
