interface kashish
{
int b=17;
void calculate();
}
class kash implements kashish
{
float a;
public void calculate()
{
	a=(float)(3.1412312*b*b*b);
}
void print()
{
	System.out.print(a);
}
}
public class Main
{
	public static void main(String args[])
	{
	kash k=new kash();
	kashish k1;
	k.calculate();
	k.print();
	}
}
	

