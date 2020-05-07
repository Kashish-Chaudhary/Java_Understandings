import java.util.*;
public class Convertint
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
for(int i=0;i<args.length;i++)
a[i]=Integer.parseInt(args[i]);
for(int i=0;i<args.length;i++)
System.out.print(a[i]+" ");
}
}