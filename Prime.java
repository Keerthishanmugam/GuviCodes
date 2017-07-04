
import java.io.*;
import java.util.*;

public class Prime
public static void main(String args[])throws IOException
    {
        int s,e,i=0,j=0;
        int count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
        List<Integer>list=new ArrayList<Integer>();
        char[] c=new char[100];
       
      
        System.out.println("Enter the starting number:");
        s=Integer.parseInt(br.readLine());
        System.out.println("Enter the ending number:");
        e=Integer.parseInt(br.readLine());
       for( i=s;i>=s&&i<=e;i++)
       {
          
              int m=i/2;
             for( j=2;j<m;j++)  
             {
                 if(i%j==0)
                 {
                     c[j]=1;
                     break;
                 }
             
             }
                if(c[j]==0)
             {
            
                list.add(i);
                count++;
              }
       
       }
    
   
      System.out.println(count);
  
    }
}
