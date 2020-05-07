import java.util.*;
class rational
{
int a,b;
	rational()
	{
		a=2;
		b=4;
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
	void sum(rational c,rational d)
	{
		rational t;
		t.a=c.a*d.b+d.a*c.b;
		t.b=c.b*d.b;
		int hcf=reduce(t);
		System.out.print((t.a/hcf)+"/"+t.b/hcf);
	}
	int reduce(rational c)
	{
	int r;
	while(c.a%c.b!=0)
	{	
		r=c.a%c.b;
		c.a=c.b;
		c.b=r;
	}
	return y;
	}
		


}

public class ration
{
public static void main(String args[])
{
	rational r1=new rational();
	rational r2=new rational(3,4);
	rational r3=new rational(r1);
	rational r4=new rational(r2);
	sum(r3,r4);
}
}
	