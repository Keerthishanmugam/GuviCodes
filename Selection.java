import java.io.*;
import java.util.*;
public class Selection {
  public static void main(String args[])throws IOException
  {
    int size,i;
    String person;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    List<String>list=new ArrayList<String>();
    System.out.println("Enter the size of queue");
    size=Integer.parseInt(br.readLine());
     System.out.println("Enter the persons in queue");
    for(i=0;i<size;i++)
    {
      person=br.readLine();
      list.add(person);
    }
    for(i=0;i<list.size()/2;i++)
    {
      String s=list.get((i*2)+1);
      list.add(s);
    }
    System.out.println("The selected person's position is "+list.get(list.size()-1));
  }
}
