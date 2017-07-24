import java.io.*;
public class IntegerPalindrome {
  public static void main(String args[])throws IOException
  {
    String rev,sum1;
    int i,value,sum=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number");
    String input=br.readLine();
    for(i=0;i<input.length();i++)
    {
       value=Character.getNumericValue(input.charAt(i));
       sum=sum+value;
       System.out.println(sum);
    }
    sum1=String.valueOf(sum);
    StringBuffer b=new StringBuffer(sum1);
    rev=b.reverse().toString();
    if(sum1.equals(rev))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }
  }
}
