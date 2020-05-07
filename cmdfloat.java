import java.util.*;
public class cmdfloat
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double a[]=new double[10];
for(int i=0;i<args.length;i++)
a[i]=Float.parseFloat(args[i]);
float sum=0;
for(int i=0;i<args.length;i++)
{
System.out.printf("%.2f \n" ,a[i]);
sum=(float)(sum+a[i]);
}
System.out.printf(" Sum=%10.2f \n" ,sum);
}
}