import java.io.*;
import java.util.*;

public class LongestPal
{
public static void main(String args[])throws IOException
{
	int i,occurance,first,flag=0;
	String word,rev,sub;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String>list=new ArrayList<String>();
	System.out.println("Enter the word");
	word=br.readLine();
	
	 
	for(i=0;i<word.length();i++)
	{
	 
	  first=word.indexOf(word.charAt(i));
	  occurance=word.indexOf("y",first+1);
	  occurance=word.indexOf(word.charAt(i),first+1);
	  if(!(occurance==-1))
		{
		
		 sub=word.substring(first,occurance)+word.charAt(i);
		 StringBuffer b=new StringBuffer(sub);
			rev=b.reverse().toString();
			
			if(sub.equals(rev))
			{
				flag=1;
				list.add(sub);
			}
			
				}
			
	}
	if(flag==0)
	{
		System.out.println("No palindrome present");
	}
	else
	{
	System.out.println("Palindrome :"+Collections.max(list));	
	}
}
}

