import java.util.*;
public class Prac
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
{int sum=0;
	for(int j=0;j<n;j++)
	{
	if(a[j]>a[i])
	sum=sum+a[j];
	}
	System.out.print(sum+" ");
}
}
}