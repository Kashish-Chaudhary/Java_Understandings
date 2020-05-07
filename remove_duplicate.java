import java.util.*;
class remove_duplicate
{
public static void main(String kashish[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
//a[0]=sc.nextInt();
int count=0;
int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	if(a[i]!=-1)
	for(int j=i+1;j<n;j++)
	if(a[i]==a[j])
	{a[j]=-1;
	}
	}
	for(int i=0;i<n;i++)
	{if(a[i]!=-1)
	System.out.print(a[i]+" ");
	
	}
	
	

}
}