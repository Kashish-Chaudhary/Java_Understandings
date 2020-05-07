import java.util.*;
class pr
{
public static void main(String kashish[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String s1=sc.next();
	String s2[]=s.split(" ");
	for(int i=0;i<s2.length;i++)
	   {
		if(s2[i].contains(s1) && s2[i].contains(s1))
		{
					System.out.println(s2[i]);
		}	
	   }
	}
}