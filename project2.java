import pack.*;
import java.lang.*;
import java.util.*;
class teacher 
{
	
	int salary,id,e;
	String name;
	teacher(String s,int a,int b,int c)
	{
		name=s;
		id=a;
		salary=b;
		e=c;
		
	}
	void calculate()
	{
		int a;
		a=(int)(salary*0.1);
		salary=salary+a;
	}
	void print()
	{
		System.out.print("name="+name+"\nid="+id+"\nsalary="+salary+"\nexperience="+e);
	}
void details()
{
}
}//29
class student 
{
	
	int marks[]=new int[5],id;
	String name;
	char grade='A';
	student(String a,int b,int m[])
	{
		
		name=a;
		id=b;
		for(int i=0;i<5;i++)
		marks[i]=m[i];

	}
	void calculate()
	{
		int a=0;
		for(int i=0;i<5;i++)
		a=a+marks[i];
		a=(int)(a/5);
		if(a>=90 && a<=100)
		grade='A';
		else if(a>=70 && a<=89)
		grade='B';
		else if(a>=50 && a<=69)
		grade='C';
		else if(a>=40 && a<=49)
		grade='D';
		else if(a>=0 && a<=39)
		grade='F';
	}
	void print()
	{
		System.out.print("name="+name+"\nid="+id+"\ngrade="+grade);
	}
void details()
{
}
}
public class project2
{
	public static void main(String kashish[])
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter whose details \n for teacher enter 1.\n for student enter 2.");
		int choice=sc.nextInt();
		int marks[]=new int[5];
		sc.nextLine();
		if(choice==1)
		{System.out.print("Enter name,Id,salary,experience\n");
		String name=sc.nextLine();
		int id=sc.nextInt();
		int salary=sc.nextInt();
		int e=sc.nextInt();
		
			teacher t=new teacher(name,id,salary,e);
			if(t.salary>30000 && t.e>4)
			t.calculate();
			t.print();
		}
		else if(choice==2)
		{
		System.out.print("Enter name,Id,marks in 5 subjects\n");
		String name=sc.nextLine();
		int id=sc.nextInt();
		for(int i=0;i<5;i++)
		marks[i]=sc.nextInt();
		
		
			student s=new student(name,id,marks);
			s.calculate();
			s.print();
		}
		else
		{
			System.out.print("WRONG INPUT");
		}
	}
}


