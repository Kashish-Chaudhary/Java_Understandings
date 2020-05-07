import java.util.*;
class second_max
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
	}int max=a[0],max2=0;;
	for(int i=1;i<n;i++)
	{
	if(a[i]>max){max2=max;
	max=a[i];}
	if(a[i]<max){max2=a[i];}
	}
	System.out.println(max2);
	
	

}
}