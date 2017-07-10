import java.io.*;
import java.util.*;
import java.util.Arrays;
public class Ascending {
public static void main(String args[])throws IOException
{
	int i;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of array");
	int n=Integer.parseInt(br.readLine());
	Integer []n1=new Integer[n];
			
	System.out.println("Enter the elements of array");
	for(i=0;i<n;i++)
	{
		int a=Integer.parseInt(br.readLine());
		n1[i]=a;
	}
	Arrays.sort(n1,Collections.reverseOrder());
	
	for(int x:n1)
	{
		System.out.println(x);
	}
}
}
