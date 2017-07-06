package guvicode;
import java.io.*;
public class Camelcase {
public static void main(String args[])throws IOException
{
	String s;
	char c;
	
	int i;
	String[] s1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the String");
	 s=br.readLine();
	s1=s.split(" ");
	
	for(i=0;i<s1.length;i++)
	{
		 c=s1[i].charAt(0);

		  c=Character.toUpperCase(c);
		  
		  String s2=c+s1[i].substring(1,s1[i].length());
			System.out.print(s2);
			if(i!=s1[i].length())
			{
				System.out.print(" ");
			}
		  }
	

}
}
