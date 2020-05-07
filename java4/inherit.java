class a
{
public void print()
{
System.out.println("a");
}
}
class b extends a
{
public void print()
{
System.out.println("b");
}
}
class inherit
{
public static void main(String args[])
{

      a d=new b();
	d.print();
   
}
}