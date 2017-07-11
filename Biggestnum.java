import java.io.*;
import java.text.*;
import java.util.*;

public class Biggestnum {
public static void main(String args[])throws IOException
{ 
	int n1,i;
	String s1,s2 ="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of array");
	int n=Integer.parseInt(br.readLine());
	Integer []n2=new Integer[n];
	
	System.out.println("Enter the elements of array");
	for(i=0;i<n;i++)
	{
		n1=Integer.parseInt(br.readLine());
		n2[i]=n1;
	}
	Arrays.sort(n2,Collections.reverseOrder());
	
	//System.out.println(s);
	for(int p:n2)
	{
		 s1 =String.valueOf(p);
		s2=s2+s1;
				
       
	}
	int n3=Integer.parseInt(s2);

	DecimalFormat df = new DecimalFormat("#,###");
	System.out.println(df.format(n3));
}
}

