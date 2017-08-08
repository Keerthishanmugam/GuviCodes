import java.io.*;
import java.util.*;
public class CoinsCount {
public static void main(String args[])throws IOException
{
	String coins;
	int sum,i,value,NumberOfCoins,total=0,amount=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	List<Integer>list=new ArrayList<Integer>();
	
	System.out.println("Enter the coins");
    coins=br.readLine();
    String[] coin=coins.split(",");
    Integer[] coinValue=new Integer[coin.length];
    Integer[] sum1=new Integer[coin.length];
    
    for(i=0;i<coin.length;i++)
    {
    	
     coinValue[i]=Integer.parseInt(coin[i]);
    }
    Arrays.sort(coinValue,Collections.reverseOrder());
   
    System.out.println("Enter the sum");
    sum=Integer.parseInt(br.readLine());
    for(i=0;i<coin.length;i++)
    {
    	
    	value=coinValue[i];
        NumberOfCoins=sum/value;
    	amount=amount+NumberOfCoins*value;
    	list.add(NumberOfCoins);
    	sum=sum-(NumberOfCoins*value);
    	sum1[i]=sum;
    	    }
    for(int j:list)
  {
	  total=total+j;
  }
    System.out.println("Total number of coins: "+total);
    for(i=0;i<coinValue.length;i++)
    {
    	if(list.get(i)==1)
    	{
    		 System.out.println(list.get(i)+" coin of "+coinValue[i]);		
    	}
    	else if(list.get(i)>1)
    	{
    		 System.out.println(list.get(i)+" coins of "+coinValue[i]);		
    	}
    	 
    }
        }
  
}

