import java.io.*;
import java.util.*;
import java.lang.*;
public class SingleCh{
  public static void main(String args[])throws IOException
  {  
    String s1,ans="";
    int i=0;
    char ch;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the word");
    String s=br.readLine();
    StringBuffer b=new StringBuffer(s);
    s1=b.reverse().toString();
    for(i=0;i<s1.length();i++)
    {
      ch=s1.charAt(i);
      if (ch!=' ')
      { 
        ans=ans+ch;
        s1=s1.replace(ch,' ');
      }
    }
    
    System.out.println(ans);
  }
}
