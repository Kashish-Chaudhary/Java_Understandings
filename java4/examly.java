import java.util.*;
class kashish
{
int id;
String s,s1;
kashish(int r,String d,String d1)
{
id=r;s=d;s1=d1;
}
}
class examly1
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List <kashish>l1=new ArrayList<>();
for(int i=0;i<n;i++)
{
int id=sc.nextInt();
sc.nextLine();
String s=sc.nextLine();
String s1=sc.nextLine();
kashish r=new kashish(id,s,s1);
l1.add(r);
}
for(kashish i:l1)
{System.out.println(i);
}

}
}