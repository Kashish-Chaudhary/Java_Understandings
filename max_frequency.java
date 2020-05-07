import java.util.*;
class max_frequency
{
public static void main(String kashish[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
//a[0]=sc.nextInt();
int count=0;
	for(int i=0;i<6;i++)
	{
		a[i]=sc.nextInt();
	}int m=0;
	for(int i=0;i<6;i++)
	{count=1;
	for(int j=i+1;j<6;j++)
	{
	if(a[i]==a[j])
	count++;
	}
	if(count>m)
	m=count;
	}
System.out.print("max fre"+m);
}
}