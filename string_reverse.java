import java.lang.*;
import java.util.*;
public class string_reverse
{
	public static void main(String kashish[])
	{	
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b[]=a.split(" ");
		String c=b[0];
		b[0]=b[b.length-1];
		b[b.length-1]=c;
		int start=1,end=b.length-2;
		while(start!=end) 
		{
		String d=b[start];
		b[start]=b[end];
		b[end]=d;
		start++;
		end--;
		}
		for(int i=1;i<b.length-1;i++)
		{
		StringBuffer sb=new StringBuffer(b[i]);
		sb=sb.reverse();
		b[i]=String.valueOf(sb);		
		}
		for(int i=0;i<b.length;i++)
		{
		System.out.print(b[i]+" ");
		
		}
	}
}


