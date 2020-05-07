interface kashish
{
int b=17;
void calculate();
static void p()
{
System.out.println("kashish 171091394");
}
}
interface kashish1
{
	int s=19;
void print1();
}
class kash implements kashish,kashish1
{
float a;
public void calculate()
{
	a=(float)(3.1412312*b*s*s);
}
public void print1()
{
	System.out.println(a);
	
}
}
public class Main1
{
	public static void main(String args[])
	{
	kash k=new kash();
	kashish k1;
	k.calculate();
	k.print1();
	kashish.p();
	p();
	}
	static void p()
	{
	System.out.println("kashish 17109");
	}
}
	

