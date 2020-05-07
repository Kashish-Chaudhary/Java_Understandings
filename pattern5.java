class Pattern5
{
public static void main(String args[])
{int n=3;
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
int r=2;
for(int k=0;k<i+1;k++)
{
System.out.print(r+" ");
r=r*2;
}
System.out.println();
}
for(int i=0;i<n-1;i++)
{
for(int j=0;j<=i+1;j++)
{
System.out.print(" ");
}
int r=2;
for(int k=0;k<n-i-1;k++)
{
System.out.print(r+" ");
r=r*2;
}
System.out.println();
}
}
}