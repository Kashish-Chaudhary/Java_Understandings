import java.util.*;
class sentance_string
{
	public static void main(String kashish[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toLowerCase();
	String str1[]=new String[10];
	str1=str.split(" ");
	for(int i=0;i<str1.length;i++)
	{
		char c[]=str1[i].toCharArray();
		if(c[0]>=97 && c[0]<=122 )
		{
			c[0]=(char)(c[0]-32);
			
		}
		String s=String.valueOf(c);
	System.out.println(s);
	}
	
}
}
	
	
	
	
	