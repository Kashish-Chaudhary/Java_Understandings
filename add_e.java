import java.util.*;
class Import
{void Sum(int a[],int start,int end)
 {int sum=0;
    for(int i=start-1;i<end;i++)
	sum=sum+a[i];
	System.out.print("Sum of numbers from "+start+" to "+end+"="+sum); }	}
public class add_e
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int start=sc.nextInt();
	int end=sc.nextInt();
	if((start>=n || start<=0) || (end>=n ||end<=0))
	System.out.print("Wrong input");
	else{
	Import I=new Import();
	I.Sum(a,start,end);
	}}}