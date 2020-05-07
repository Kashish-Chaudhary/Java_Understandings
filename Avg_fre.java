import java.util.*;
public class Avg_fre
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int no=sc.nextInt();
for(int i=0;i<n;i++)
{
int sum=0,c=0;
sum=(no+a[i])/2;
//System.out.print(sum+" ");
for(int j=0;j<n;j++)
if(sum==a[j])
c++;
System.out.print(c+" ");
}
}
}