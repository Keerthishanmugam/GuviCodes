import java.io.*;
import java.util.Arrays;
public class RotationValue {
  public static void main(String args[])throws IOException
  {
    int size,value,value2,i;
    int first=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of array");
    size=Integer.parseInt(br.readLine());
    System.out.println("Enter the elements of array");
    Integer[] values=new Integer[size];
    Integer[] values2=new Integer[size];
    for(i=0;i<size;i++)
    {
      value=Integer.parseInt(br.readLine());
      values[i]=value;
    }
    first=values[0];
    System.out.println("Enter the elements of rotated array");
    for(i=0;i<size;i++)
    {
      value2=Integer.parseInt(br.readLine());
      values2[i]=value2;
    }
    int index=Arrays.asList(values2).indexOf(first);
    
    System.out.println("The value of k is "+(index-first));
  }
}
