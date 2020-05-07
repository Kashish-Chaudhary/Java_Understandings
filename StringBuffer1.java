class Stringbuffer1
{
	public static void main(String args[])
	{
	//Scanner sc=new Scanner(System.in);
	String str="kashis chaudhary";	
	String str1[]=str.split(" ");
	String s="";
	for(int i=0;i<str1.length;i++)
	{
	StringBuffer sb=new StringBuffer(str1[i]);
	sb.reverse();
	String s1=sb.toString();
	s=s+s1+" ";
	}
	System.out.println(s);
	}
}
	
		