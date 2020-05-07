class base
{int k,c;
base()
{
System.out.println("in base");
}
base(int a)
{
System.out.println(a+"in base");
}
static void show()
{
System.out.print("show in base");
}
}

class derived1 extends base
{
derived1(int a,int b)
{super(b);
this.show();

System.out.println("in derived1   "+super.k+"  "+super.c);
}
static void show()
{
System.out.print("show in derived");
}
}
class inherit_prac
{
public static void main(String args[])
{

derived1 d=new derived1(10,20);


}
}