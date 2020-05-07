import java.util.*;
class cut_the_sticks
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
	}int m=0;count=n;
	int small;
	System.out.println("Sticks after cut\n");
	while(count>0){count=0;
	small=35535;
	for(int i=0;i<n;i++)
		if(a[i]!=0)
			if(a[i]<small)
				small=a[i];
	for(int i=0;i<n;i++)
	{
		if(a[i]!=0)
		{	
			a[i]=a[i]-small;
			count++;
		}
	}
	if(count!=0)
	System.out.println(count);
	
	}

}
}