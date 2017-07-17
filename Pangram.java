package proque;
import java.io.*;
import java.util.*;
public class Pangram {
public static void main(String args[])throws IOException
{
	int i,count=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sentence");
	String s=br.readLine();
	s=s.replace(" ","");
	List<Character>list=new ArrayList<Character>();
	int n=s.length();
	for(i=0;i<n;i++)
	{
		list.add(s.charAt(i));
	}
	for(i=97;i<=122;i++)
	{
	  char a=(char)i;	
	
	if(list.contains(a))
	{
		count++;
	}
	else
	{
		System.out.println("It is not Pangram");
		break;
	}
	
	if(count==26)
	{
		System.out.println("It is Pangram");
	}
	}
}
}
