import java.io.*;
import java.util.*;
public class Seeds {
public static void main(String args[])throws IOException
{
	int number,i,count=0,sum=1,flag=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Integer>list=new ArrayList<Integer>();
	List<Integer>less=new ArrayList<Integer>();
	System.out.println("Enter the number");
     number=Integer.parseInt(br.readLine());
     for(i=1;i<number;i++)
     {
    	if(number%i==0)
    	{
    		if(i>10)
    		{
    		list.add(i);
    		}
    		else
    		{
    		less.add(i);
    		}
    	}
     }
     for(int no:list)
     {
    	 String s=String.valueOf(no);
    	  sum=Integer.parseInt(s);
    	 for(i=0;i<s.length();i++)
    	 {
    		
    		int j=Character.getNumericValue(s.charAt(i)); 
    		if(less.contains(j))
    		{
    			sum=sum*j;
    			count++;
    		}
    	 }
			if((count==s.length())&&(sum==number))
    		{
    			System.out.println(s);
    			flag=1;
    		}
    		else
    		{
    			count=0;
    			}
   }
     if(flag==0)
     {
    	 System.out.println("No seeds");
     }
}
}
