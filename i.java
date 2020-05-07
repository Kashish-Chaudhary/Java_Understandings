import java.util.*;
class i
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();

  int p=str.length();
char []a=new char[p];
a=str.toCharArray();
 int j=0,c=0,m=0,l=0,i=0;
 // p=a.length;
     String b="";
      String str1="";
int k=0;
	//System.out.println(a.length);
  while(i<=p)
  {
   while(a[i]!=' ')
    {
      b=b+a[i];
      i++;
	if(i>=p)
{k=1;
	break;
}

    }
if(k==1)
break;
    for(j=(b.length())-1;j>=0;j--)
    {
      str1=str1+b.charAt(j);
    }
    if(str1.equals(b))
      {c++;}
    b="";
    str1="";
    i++;
 
  }
System.out.print(c);
 
}
}