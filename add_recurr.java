import java.util.*;
class Import
{int i;
	Import()
	{i=0;}
int Sum(int n)
 {
int r=n%10;
i++;
n=n/10;
if(n<=0)
return i;
else
return (Sum(n));
 }	
}
public class add_recurr
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Import I=new Import();
	int r=I.Sum(n);
	System.out.print(r);
	}}