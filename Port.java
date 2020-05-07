import java.util.Scanner;
public class Port
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name,collage name,branch");
String name=sc.nextLine();
String clg=sc.nextLine();
String branch=sc.nextLine();
System.out.println("enter no. of subjects");
int n=sc.nextInt();
int a[]=new int[n];
int sum=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
float avg=(float)sum/n;
String str=String.format("roll no. %d\n name: %s sum: %d\n avg: %f",n,name,sum,avg);
System.out.println(str);
}
}
 