import java.io.*;
import java.util.*;

public class Frepeated {
	public static void main(String args[])throws IOException
	{
	int i,a = 0;
	String s = null;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	List<String>list=new ArrayList<String>();
	
	System.out.println("enter the value of n");
	int n=Integer.parseInt(br.readLine());
	System.out.println("Enter the numbers"); 
	
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
	   System.out.println(s1);
	   break;
     }
   }
   if(!(a>2))
   {
	   System.out.println("No repeatation");
   }
    
  }
	}
}
