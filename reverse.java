import java.io.*;
public class reverse {
 public static void main(String args[])throws IOException
 {
	 String s;
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("Enter the String");
	  s=br.readLine();
	 if(s.length()<=1)
	  {
		  System.out.println(s);
	  }
	  else
	  {
	 StringBuilder b=new StringBuilder(s);
	 b=b.reverse();
	 System.out.println(b);
 }
}
