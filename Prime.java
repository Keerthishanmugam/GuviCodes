import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[])throws IOException
  {
    int s,e,flag=0,i=0,j=0;
    int count=0;
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    
     char[] c=new char[100];
    
    
    System.out.println("Enter the starting number:");
    s=Integer.parseInt(br.readLine());
    System.out.println("Enter the ending number:");
    e=Integer.parseInt(br.readLine());
    for( i=s;i>=s&&i<=e;i++)
    {
       if(i==1)
             {
        	 i++; 
         }
      int m=i/2;
      for( j=2;j<m;j++)  
      {
        if(i%j==0)
        {
          c[i]=1;
          break;
        }
        
      }
      if(c[i]==0)
      {
          count++;
        
      }
      
    }
    
    System.out.println(count);
    
  }
}
