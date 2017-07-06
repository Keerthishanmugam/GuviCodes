import java.util.*;
public class Time {
	private static Scanner sc;

	public static void main(String args[])
	{
		int h1,h2,h,mins;
		float s,e;
		double mins1,mins2;
		sc = new Scanner(System.in);
		System.out.println("Enter the Starting time");
		 s=sc.nextFloat();
		System.out.println("Enter the Ending time");
		 e=sc.nextFloat();
		h1=(int)s;
		h2=(int)e;
		mins1=(int) ((s)*100%100);
		mins2=(int) ((e)*100%100);
		
		if(h1==12)
		{
			h1=0;
		}
		if(h2==12)
		{
			h2=0;
		}
	     if(mins2<mins1)
	     {
	    	 mins1=60-mins1;
	    	
	    	
	    	 mins=(int)(mins1+mins2);
	    	 System.out.println(mins);
	    	 h=(h2-h1)-1;
	     }
	     else
	     {
	    	mins=(int)(mins2-mins1);
	    	System.out.println(mins);
	    	h=h2-h1;
	     }
		System.out.println(h+" hours "+mins+" minutes.");
	}

}
