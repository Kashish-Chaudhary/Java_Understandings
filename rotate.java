import java.util.*;
class rotate
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=n;
	int i=0;;
	int e=0;
	int d=0;
	while(a>0)
	{i++;
	a=a/10;
	}
	d=i;
	double sum=n;
	double k=Math.pow(10,i-1);
	//System.out.println(i);
	while(i>0)
	{int count=0;
		for(int j=2;j<=sum;j++)
		{
		if(sum%j==0)
		count++;
		}
		if(count==1)
	{
		e++;
	}
		
		double r=sum%10;
		sum=(int)((r*k)+sum/10);
		i--;
	}
	if(e==d)
	System.out.println("rotate prime");
	else
	System.out.println("not rotate prime");
	
	}
}