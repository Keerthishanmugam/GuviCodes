import java.io.*;
import java.util.*;
public class Pangram {
public static void main(String args[])throws IOException
{
	int count=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the sentence");
	String s=br.readLine();
	s=s.replace(" ","");
	List<Character>list=new ArrayList<Character>();
	int n=s.length();
	for(int i = 0;i<n;i++)
	{
		list.add(s.charAt(i));
	}
	for(char c:list)
	{
	int a=Collections.frequency(list,c);
	
	if(a>1)
	{
		System.out.println("It is not Pangram");
		break;
	}
	else
	{
		count++;
	}
	}
	if(count==s.length())
	{
		System.out.println("It is Pangram");
	}
}
}
