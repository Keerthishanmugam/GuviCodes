import java.io.*;
public class UserId {
public static void main(String args[])throws IOException
{
	String firstName,secondName,longest,shortest;
	String code,id,idRev,userId;
	int number;

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the first name");
	firstName=br.readLine();
	System.out.println("Enter the second name");
	secondName=br.readLine();
	System.out.println("Enter the id");
	id=br.readLine();
	System.out.println("Enter the number");
	number=Integer.parseInt(br.readLine());
	if(firstName.compareTo(secondName)>0)
	{
		longest=secondName;
		shortest=firstName;
	}
	else
	{
		longest=firstName;
		shortest=secondName;
	}
	code=longest.charAt(0)+shortest;
	StringBuilder toggled=new StringBuilder(code.length());
	for(char letter:code.toCharArray())
	{
		
	if(Character.isUpperCase(letter))
	{
		letter=Character.toLowerCase(letter);
	}
	else
	{
		letter=Character.toUpperCase(letter);
	}
	toggled.append(letter);
	}
	code=toggled.toString();
	StringBuffer b=new StringBuffer(id);
	idRev=b.reverse().toString();
	userId=code+id.charAt(number-1)+idRev.charAt(number-1);
	System.out.println(userId);
}
}
