import java.util.*;
class Stringbuffer
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	StringBuffer sb=new StringBuffer(str);
	sb.append("38");
	sb.insert(5,"good");
	sb.delete(5,9);
	sb.replace(3,7," gully boy");
	
	
	System.out.print(sb);
	}
}
	
		