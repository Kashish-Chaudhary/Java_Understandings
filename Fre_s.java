import java.util.*;
class Fre_s
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<n;i++)
	{int c=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			c++;
			
		}
	b[i]=c;
	}
	int x=1;
	while(x<n)	
{
	for(int i=0;i<n;i++)
	if(b[i]==x)
	System.out.print(a[i]+" ");
	x++;


}
}
}