import java.io.*;
import java.util.*;
public class Tallest {
  public static void main(String args[])throws IOException
  {
    int number,i,height,num;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter the number of student");
    number=Integer.parseInt(br.readLine());
    System.out.println("Enter the n th student to find height");
    num=Integer.parseInt(br.readLine());
    Integer[] student=new Integer[number];
    System.out.println("Enter the students height");      
    for(i=0;i<number;i++)
    {
      
        height=Integer.parseInt(br.readLine());
        student[i]=height;
    }
    Arrays.sort(student,Collections.reverseOrder());
     
    System.out.println("The "+num+" tallest boy is "+student[num-1]);
  }
}

