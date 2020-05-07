class Pattern3
{
public static void main(String args[])
{int k=0;
int r=1,n=4;
int u=n+(n/2)+1;
for(int i=0;i<n;i++)
{if(i==0)
{}
else
u=u-1;
for(int j=u-i+1;j>=0;j--)
{
System.out.print(" ");
}
for(k=0;k<i+1;k++)
System.out.print((k+1)+" ");
if(i>0)
{
for(int l=k-1;l>0;l--)
System.out.print(l+" ");
}
System.out.println();
}}}