import java.util.*;
class outer
{
	void fun()
	{
		String str="kashish";
		String str1="kashish";
		String str2=str+str1+"kashish";
		System.out.print(str2.charAt(5)+"  "+str2.length());
		if(str.equals(str1))
		System.out.print("yes");
		else
		 System.out.print("no");
	}
}
class stat
{
	static int a=10;
	public static void main(String args[])
	{	
		for(int i=0;i<args.length;i++)
		System.out.print(args[i]+" ");
	}
}