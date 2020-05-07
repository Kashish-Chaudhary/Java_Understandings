import java.util.*;
class Kth_largest
{
public static void main(String kashish[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
a[0]=sc.nextInt();
int small=a[0];int loc=0;
	for(int i=1;i<6;i++)
	{
		a[i]=sc.nextInt();
		if(small<a[i]){
		small=a[i];loc=i;}
	}
	int smax=small;
	int k=sc.nextInt();
	if(k==1)
	System.out.print(small);
	else
	{
	int count=1;
	for(int i=0;i<6;i++)
	{	if(count==k){
		System.out.print(smax);break;}
		else { a[loc]=-1;
			for(int j=0;j<5;j++)
			if(a[j]!=-1 && a[j+1]!=-1)
			if(a[j]<a[j+1] && a[j+1]<small)	
			{smax=a[j+1];
			loc=j+1;
			}
			count++;
		     }
	}}
//System.out.print(smax);
}
}