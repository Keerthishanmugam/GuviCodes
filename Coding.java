import java.io.*;
public class Coding {
public static void main(String args[])throws IOException
{
	String word;
	int i,value;
	String code = "";
	char ans;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the word");
	word=br.readLine();
	
	for(i=0;i<word.length();i++)
	{
	 value=(int)word.charAt(i);	
	 System.out.println(value);
	  ans = (char)(value+10);
	  if(value==32)
	  {
		  ans=32;
	  }
	  if(value>112)
	  {
		ans=(char)(value-16);
		 System.out.println(ans);
	  }
	  System.out.println(ans);
	  code=code+ans;
	}
	System.out.println(code);
	
	
}
}
