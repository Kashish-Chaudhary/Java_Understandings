import java.util.*;
public class Smallest_of_next_small
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
	for(int j=i+1;j<n;j++)
	if(a[j]<a[i])
	{
	sum=a[j];
	}
System.out.print(sum+" ");
}

}
}