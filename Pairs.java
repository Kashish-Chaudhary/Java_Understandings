import java.util.*;
public class Pairs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int num=sc.nextInt();
int r,b;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if((a[i]+a[j])==num)
{
System.out.printf("%d %d ",a[i],a[j]);
System.out.println();}
}

}
}
}