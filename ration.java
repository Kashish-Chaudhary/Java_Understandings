import java.util.*;
class rational
{
int a,b;
	rational()
	{
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
	}
	rational(int c,int d)
	{
		a=c;
		b=d;
	}
	rational(rational d)
	{
	a=d.a;
	b=d.b;
	}
	void sum(rational d)
	{
		rational t=new rational(3,4);
		t.a=a*d.b+d.a*b;
		t.b=b*d.b;
	
		int hcf=reduce(t);
	System.out.println("SUM OF RATIONAL NUMBER IS\n"+(t.a/hcf)+"/"+(t.b/hcf));
	
	}
	int reduce(rational c)
	{
	int r;
	rational d=new rational(3,4);
	d.a=c.a;
	d.b=c.b;
	while(d.a%d.b!=0)
	{	
		r=d.a%d.b;
		d.a=d.b;
		d.b=r;
	}
	return d.b;
	}
		void subtract(rational d)
	{
		rational t=new rational(3,4);
		t.a=a*d.b-d.a*b;
		t.b=b*d.b;
	
		int hcf=reduce(t);
		
	System.out.println("DIFFERENCE OF RATIONAL NUMBER IS\n"+(-t.a/hcf)+"/"+(-t.b/hcf));
	
	}
		void multiply(rational d)
	{
		rational t=new rational(4,3);
		t.a=a*d.a;
		t.b=b*d.b;
	
		int hcf=reduce(t);
		
	System.out.println("MULTIPLY OF RATIONAL NUMBER IS\n"+(t.a/hcf)+"/"+(t.b/hcf));
	
	}
		void divide(rational d)
	{
		rational t=new rational(3,4);
		t.a=a*d.b;
		t.b=b*d.a;
		int hcf=reduce(t);
	System.out.println("divide OF RATIONAL NUMBER IS\n"+(t.a/hcf)+"/"+(t.b/hcf));
	
	}
		


}

public class ration
{
public static void main(String args[])
{
	System.out.print("enter first number");
	rational r1=new rational();
	System.out.print("enter second number");
int c,b;
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		b=sc.nextInt();
	rational r2=new rational(c,b);
	rational r3=new rational(r1);
	rational r4=new rational(r2);
int a;

System.out.print("Enter your choice 1:add,2:subtract,3:multiply,4:divide");
a=sc.nextInt();
switch(a)
{
case 1:
	{
	r3.sum(r4);
	break;
	}
case 2:
	{
	r3.subtract(r4);
	break;
	}	
case 3:
	{
	r3.multiply(r4);
	break;
	}
case 4:
	{
	r3.divide(r4);
	break;
	}
default:{System.out.print("WRONG CHOICE");
	break;}
}
	
}
}
	