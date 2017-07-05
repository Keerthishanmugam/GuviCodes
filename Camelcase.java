import java.io.*;
public class Camelcase {
public static void main(String args[])throws IOException
{
	String s;
	char c,c1;
	int i;
	String[] s1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the String");
	 s=br.readLine();
	s1=s.split(" ");
	
	for(i=0;i<s1.length;i++)
	{
		
		  c=s1[i].charAt(0);
		  c1=Character.toUpperCase(c);
		  s1[i] = s1[i].replace(c,c1);
		  
			System.out.print(s1[i]);
			if(i!=s1[i].length())
			{
				System.out.print(" ");
			}
		  }
	

}
}
