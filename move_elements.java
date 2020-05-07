import java.util.*;
class move_elements
{
public static void main(String kashish[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int loc=0;
	for(int i=0;i<6;i++)
	{
		a[i]=sc.nextInt();
		if(a[i]>0)
		for(int j=0;j<i;j++)
		{
			if(a[j]<0)
			{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			}
		}
			
	}
for(int i=0;i<6;i++)
System.out.print(a[i]+" ");
	
}
}