import java.util.*;
public class Rotation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
int num=sc.nextInt();
int r,b;
for(int i=0;i<num;i++)
{
r=sc.nextInt();
b=sc.nextInt();
int temp=a[r];
a[r]=a[b];
a[b]=temp;

}
System.out.print(a[num]);


}
}