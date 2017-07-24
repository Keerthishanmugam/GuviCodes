import java.io.*;
import java.util.*;
public class ReverseOdd {
  public static void main(String args[])throws IOException
  {
    int i;
    String sentence,ans,result="";
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    List<String>list=new ArrayList<String>();
    System.out.println("Enter the sentence");
    sentence=br.readLine();
    String[] word=sentence.split(" ");
    
    for(i=0;i<word.length;i++)
    {
        StringBuffer b=new StringBuffer(word[i]);
      if(i%2==0)
      {
          ans= b.reverse().toString(); 
      }
      else
      {
          ans=word[i];
      }
      list.add(ans);
    }
    for(i=0;i<list.size();i++)
    {
      System.out.print(list.get(i));
      if(i+1<list.size() )
      {
         System.out.print(" ");
       }  
    }  
  }
}
