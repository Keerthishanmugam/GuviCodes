import java.io.*;
import java.util.*;
public class Roman {
public static void main(String args[])throws IOException
{
	String s,s1;
	int i,sum=0;
	int[]n=new int[50];
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the roman number");
    s=br.readLine();
    s1=s.toUpperCase();
    char []c=s1.toCharArray();
    Map<Character,Integer>m=new HashMap<Character,Integer>();
    m.put('I',1);
    m.put('V',5);
    m.put('X',10);
    m.put('L',50);
    m.put('C',100);
    m.put('D',500);
    m.put('M',1000);
   for(i=0;i<s.length();i++)
   {
	  n[i]=m.get(c[i]);
   }
   for(i=0;i<s.length();i++)
   {
	  if(n[i]<n[i+1])
	  {
	  sum=sum+n[i]-(2*n[i]);
	 
	  }
	  else
	  {
		  sum=sum+n[i]; 
	  }
   }
  System.out.println(sum);
	
}
}
