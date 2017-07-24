import java.io.*;
public class Reverse {
  public static void main(String args[])throws IOException
  {
    String word;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string");
    word=br.readLine();
    StringBuffer b=new StringBuffer(word);
    System.out.println(b.reverse().toString());
  }
}
