import java.util.*;
class Import
{
String arr[]=new String[10];
char name[];
int roll;
float marks;
Import(String s)
{
arr=s.split(",");
name=arr[0].toCharArray();
roll=Integer.parseInt(arr[1]);
marks=Float.parseFloat(arr[2]);
}
void display(){
System.out.print(name);
System.out.print(" "+roll+" "+marks);
}	}
class String1
{
	public static void main(String kashish[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Import i=new Import(s);
	i.display();
	}
}