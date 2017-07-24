import java.io.*;
public class SubstringIndex {
  public static void main(String args[])throws IOException
  {
    String word,sub;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the String");
    word=br.readLine();
    System.out.println("Enter the substring");
    sub=br.readLine();
    if(word.contains(sub))
    {
        char c=sub.charAt(0);
        System.out.println(word.indexOf(c));
    }
    else
    {
     System.out.println("Not a substring");
    }
}
