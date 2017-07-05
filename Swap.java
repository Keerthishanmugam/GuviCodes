

import java.io.*;


public class Swap {
public static void main(String args[])throws IOException
{
	int i;
	char temp=' ';
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter the String");
	String s=br.readLine();
	char[] c=s.toCharArray();
	int l=s.length();
	if(l>1)
	{
	for(i=0;i<l-1;i++)
	{
	temp=c[i];
	c[i]=c[i+1];
	c[i+1]=temp;
	i++;
	 }
	String s1=new String(c);
	System.out.println(s1);
	}
	else
	{
		System.out.println(s);
	}
}
}
