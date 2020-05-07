import java.util.*;
public class Bubble_sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<10;i++)
a[i]=sc.nextInt();
for(int i=0;i<10;i++)
{
for(int j=0;j<10-i-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}

}
for(int i=0;i<10;i++)
System.out.print(a[i]+" ");
}
}