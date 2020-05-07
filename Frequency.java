import java.util.*;
public class Frequency
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
for(int k=0;k<n;k++)
a[k]=sc.nextInt();
int max=1;
int min=1;
for(int i=0;i<n;i++)
{
	int c=1;

if(a[i]!=-1)
	for(int j=i+1;j<n;j++)
	if(a[i]==a[j])
{
		c++;
		a[j]=-1;
}
if(c>max)
max=c;
else if(c<min)
min=c;
	
}

System.out.print("max="+max+ " " +min);
}
}
 