class Pattern4
{
public static void main(String args[])
{int k=0;
int n=8;
for(int i=0;i<n;i++)
{
for(k=0;k<i+1;k++)
System.out.print((i+1)+" ");
System.out.println();
}
for(int i=0;i<n-1;i++)
{
for(k=n-i-1;k>0;k--)
System.out.print((n-i-1)+" ");
System.out.println();
}
}
}