package proque;
import java.util.*;
public class Probability {
public static void main(String args[])
{
	int i,count=0,s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range");
	int n=sc.nextInt();
	System.out.println("Enter the divider");
	s=sc.nextInt();
	if(n>1)
	{
	for(i=1;i<n;i++)
	{
		if(i%s==0)
		{
			System.out.println(i);
			count++;
		}
	}
	double s1=(double)count/(double)i;
	System.out.println("Numbers divided by "+s+" probability is "+s1);
	}
	else
	{
		System.out.println("Invalid input");
	}
}
}
