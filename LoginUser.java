import java.io.*;
import java.util.*;
public class LoginUser {
  public static void main(String args[])throws IOException
  {
    String users;
    int times,k,j=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    List<String>list=new ArrayList<String>();
    TreeMap<Integer,String>m=new TreeMap<Integer,String>();
    System.out.println("Enter the user login");
    users=br.readLine();
    System.out.println("Enter the k value");
    k=Integer.parseInt(br.readLine());  
    String[] login=users.split(",");
    for(String user:login)
    {
        list.add(user);
    }
    for(String time:list)
    {
        times=Collections.frequency(list, time);
        m.put(times,time);
    }
    
     NavigableMap<Integer, String> nm=m.descendingMap();
    
      for(Entry<Integer, String> a: nm.entrySet())
      {
        
        int key  = a.getKey();
        String value =a.getValue();
        System.out.println(value+" "+"("+key+")");
        j++;  
          while(j==k)
          {
            
            break;
             }
       }
  }
}
