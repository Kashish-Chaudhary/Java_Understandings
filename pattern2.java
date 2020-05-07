class Pattern2
{
public static void main(String args[])
{
int r=1,n=9;
int u=n+(n/2)+1;
for(int i=0;i<n;i++)
{if(i==0)
System.out.print("");
else
{u=u-1;
}
for(int j=u-i+1;j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<r;k++)
System.out.print((i+1)+" ");
r=r+2;
System.out.println();
}
r=n+(n/2)+1;
u=1;
for(int i=n-1;i>0;i--)
{if(i==0)
System.out.print("");
else
{
u=u+2;
}
for(int j=0;j<u-1;j++)
{
System.out.print(" ");
}
for(int k=0;k<r+1;k++)
System.out.print((i)+" ");
r=r-2;
System.out.println();
}
}
}