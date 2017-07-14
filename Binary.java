package proque;
import java.io.*;
import java.util.*; 
public class Binary {
	
public static void main(String args[])throws IOException
{
	
	int n,r,i;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<String>list=new ArrayList<String>();
	System.out.println("Enter the number");
	n=Integer.parseInt(br.readLine());
	r=(int) Math.pow(2,n);
	if(n>0)
	{
	for(i=0;i<r;i++)
	{
		
		String b=Integer.toBinaryString(i);
		StringBuffer s=new StringBuffer(b);
		while(s.length()<n)
		{
			s.insert(0, "0");
		}
		String b1=s.toString();
		list.add(b1);
		
		
	}
	for(String x:list)
	{
		System.out.println(x);
	}
	}
	else
	{
		System.out.println("Invalid Input");
	}
	
}
}
