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
	for(i=1;i<n;i++)
	{
		if(i%s==0)
		{
			System.out.println(i);
			count++;
		}
	}
	System.out.println("Numbers divided by "+s+" is "+count);
}
}
