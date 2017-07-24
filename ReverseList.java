import java.io.*;
import java.util.*;
public class ReverseList {
  public static void main(String args[])throws IOException
  {
    int size,i,number;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    List<Integer>list=new ArrayList<Integer>();
    System.out.println("Enter the size of list");
    size=Integer.parseInt(br.readLine());
    System.out.println("Enter the elements of list");
    for(i=0;i<size;i++)
    {
      number=Integer.parseInt(br.readLine()); 
      list.add(number);
    }
    Collections.sort(list);
    Collections.reverse(list);
    System.out.println(list);
  }
}
