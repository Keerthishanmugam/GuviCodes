import java.io.*;
public class LongestPal {
public static void main(String args[])throws IOException
{
	int i;
	String word,rev,palindrome ="";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the word");
	word=br.readLine();
	StringBuffer b=new StringBuffer(word);
	rev=b.reverse().toString();
	for(i=0;i<word.length();i++)
	{
		if(word.charAt(i)==rev.charAt(i))
		{
			palindrome=palindrome+word.charAt(i);
		}
	}
	System.out.println(palindrome);
}
}
