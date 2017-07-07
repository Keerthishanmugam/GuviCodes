import java.io.*;
public class Index {
	public static void main(String args[])throws IOException
	{
		int s,i,a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of the array");
		int n=Integer.parseInt(br.readLine());
		int[] n1=new int[n];
		System.out.println("Enter the numbers");
		for(i=0;i<n;i++)
		{
			s=Integer.parseInt(br.readLine());
			n1[i]=s;
		}
		for(i=0;i<n;i++)
		{
			 a=n1[i];
		
		if(a==i)
		{
			System.out.println(a);
		}
		}
	}

}
