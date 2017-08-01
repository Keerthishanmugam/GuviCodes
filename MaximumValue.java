import java.io.*;
import java.util.Arrays;
public class MaximumValue{
public static void main(String args[])throws IOException
{
	int number,i,sum=0,n;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the number of elements in the array");
	number=Integer.parseInt(br.readLine());
	System.out.println("Enter the value of n");
	n=Integer.parseInt(br.readLine());
	if(number>3)
	{
		System.out.println("Enter the elements");
	int[] values=new int[number];
	for(i=0;i<number;i++)
	{
	 values[i]=Integer.parseInt(br.readLine());
	}
	Arrays.sort(values);
	for(i=number;i>number-n;i--)
	{
	sum=sum+values[i-1];
	}
	System.out.println(sum);
	}
	else
	{
		System.out.println("Enter a number greater than "+n);
	}
}
}
