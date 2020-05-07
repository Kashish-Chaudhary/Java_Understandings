import pack.*;
import java.util.*;
class teacher 
{
	static Scanner sc;
	int salary=0,id,e;
	String name;
	void details()
	{
		System.out.print("Enter name,Id,salary,experience");
		name=sc.nextLine();
		id=sc.nextInt();
		salary=sc.nextInt();
		e=sc.nextInt();
	}
	void calculate()
	{
		int a;
		a=(int)(salary*0.1);
		salary=salary+a;
	}
	void print()
	{
		System.out.print("name="+name+"\nid="+id+"\nsalary="+salary);
	}
}
class student 
{
	static Scanner s;
	int marks[]=new int[5],id;
	String name;
	char grade;
	void details()
	{
		System.out.print("Enter name,Id,marks in 5 subjects");
		name=s.nextLine();
		id=s.nextInt();
		for(int i=0;i<5;i++)
		marks[i]=s.nextInt();

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
}
public class project
{
	public static void main(String kashish[])
	{
		Scanner sr=new Scanner(System.in);
		System.out.print("Enter whose details \n for teacher enter 1.\n for student enter 2.");
		int choice=sr.nextInt();
		if(choice==1)
		{
			teacher t=new teacher();
			t.details();
			if(t.salary>30000 && t.e>4)
			t.calculate();
			t.print();
		}
		else if(choice==2)
		{
			student s=new student();
			s.details();
			s.calculate();
			s.print();
		}
		else
		{
			System.out.print("WRONG INPUT");
		}
	}
}


