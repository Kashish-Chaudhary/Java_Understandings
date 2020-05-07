import java.util.*;
class Import
{
char name[];
Import(String s)
{
name=s.toCharArray();
}
void display(){int count=0;
for(int i=0;i<name.length;i++)
{count=1;
if(name[i]!=' ')
	{for(int j=i+1;j<name.length;j++)
	{	
		if(name[i]==name[j])
		{
		count++;
		name[j]=' ';
		}
	}
	System.out.println("Frequency of "+name[i]+" = "+count);}
}


}	}
class String2
{
public static void main(String kashish[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Import i=new Import(s);
	i.display();
	}
}