import java.io.*;
public class Substring {
public static void main(String args[])throws IOException
{
	String s1,s2;
	int i,j;
	int flag=0;
	char a,b,a1,b1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first string");
	s1=br.readLine();
	System.out.println("Enter the second string");
	s2=br.readLine();
	char[]c1=s1.toCharArray();
	char[]c2=s2.toCharArray();
	int n=s1.length();
	
	int n1=s2.length();
	for(i=0;i<n-1;i++)
	{
		
		a=c1[i];
		a1=c1[i+1];
	
		for(j=0;j<n1-1;j++)
		{
			b=c2[j];
			b1=c2[j+1];
			if((a==b)&&(a1==b1))
			{
				 flag=1;
					System.out.println("substring of A is substring of B");
					break;
				}
				
			}
		if(flag==1)
			break;
		}
	
			if(flag==0)
			{
				System.out.println("No sub strings present");
				
			}
      }
}
