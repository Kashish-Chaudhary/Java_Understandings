import java.util.*;
public class Sumdiff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();

for(int i=0;i<n;i++)
{int sum=0,sum1=0;
	for(int j=i+1;j<n;j++)
	if(a[j]>a[i])
	{
	sum=a[j];
	break;
	}
for(int k=i+1;k<n;k++)
	if(a[k]<a[i])
	{
	sum1=a[k];
	break;
	}
int r=0;
r=sum-sum1;
if(r<0)
r=-r;
System.out.print(r+" ");
}

}
}