import java.util.*;
class string_prac
{
	public static void main(String kashish[])
		{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		String s2=s.concat(s1);	
		String s3[]=new String[10];
		char c[]=s.toCharArray();
		int n=s2.length();
	//	if(s.compareToIgnoreCase(s1)==0)   //compareTo function works on dictionary 
	//	System.out.print("small");
	//	if(s.equals(s1))
	//	System.out.print("equal");
	//	System.out.print(s.equals(s1));		//int num=Integer.parseInt(string);
	//	if(s.endsWith(s1))
	//	System.out.print("true");		//int num=Float.parseFloat(string);
	//	else
	//	System.out.print("false");
	//	int m=s.lastIndexOf(s1);
	//	System.out.println(m);
	//	s=s.replace('h','k');
	//	System.out.print(s);
	//	s2=s.substring(5,10);
	//	System.out.print(s2);
	//	s2=s.toLowerCase();
	//	System.out.print(s2);
	//	s2=s.toUpperCase();
	//	System.out.print(s2);
		int v=10;
	//	s2=String.valueOf(v);
	//	System.out.print(v);
		s2=String.valueOf(c);
		System.out.print(s2);
	//	char c='a';
	//	System.out.print(c+""+v);
	//	s2=String.join(",",s,s1);
	//	System.out.print(s2);
		//s3=s.split(",");
		//System.out.print(s3[0]+" "+s3[1]+" "+s3[2]);
		}
}