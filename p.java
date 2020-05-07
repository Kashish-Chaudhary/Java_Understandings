import java.util.*;
class A
{
int a,b,c;
A(int a,int b)
{
this.a=10;
this.b=20;
}
void finalise(String a,String b)
{
System.out.println(a+""+b);

}
}
class p
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//int n=sc.nextInt();
	A a1=new A(10,20);
	int i=10;
	//a1.finalise(22);
	a1.finalise("&","*");
	System.out.print(a1.a+" "+a1.b);
}
}