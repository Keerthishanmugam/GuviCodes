import java.io.*;
public class Strtoint
{
  
  public static void main(String args[])throws IOException
  {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the string");
    String s=br.readLine();
    int i=Integer.parseInt(s);
    System.out.println(i);
    }
    }

