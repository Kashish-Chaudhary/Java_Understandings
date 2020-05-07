import java.util.*;
class toostring
{
int r1,r2;
toostring()
{
	r1=0;
	r2=0; 
}
toostring(int a,int b)
{
	r1=a;
	r2=b ;
}
toostring subtraction(toostring r)
{
toostring s=new toostring();
s.r1=r1-r.r1;
s.r2=r2-r.r2;
return s;
}
toostring addition(toostring r)
{
toostring s=new toostring();
s.r1=r1+r.r1;
s.r2=r2+r.r2;
return s;
}
public String toString()
{
if(r2>0)
return r1+"+"+r2+"i";
else
return r1+""+r2+"i";
}
toostring multiplication(toostring r)
{
toostring s=new toostring();
s.r1=(r1*r.r1)-(r2*r.r2);
s.r2=(r1*r.r2)+(r.r1*r2);
return s;
}

}

class toStringg
{

public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,i1,r2,i2;
		r1=sc.nextInt();		
		i1=sc.nextInt();
		r2=sc.nextInt();
		i2=sc.nextInt();
		toostring t=new toostring(r1,i1);
		toostring t1=new toostring(r2,i2);
		toostring t2=new toostring();
		t2=t.subtraction(t1);
		System.out.println("Result after subtraction=\n"+t2);
		t2=t.addition(t1);
		System.out.println("Result after subtraction=\n"+t2);
		t2=t.multiplication(t1);
		System.out.println("Result after subtraction=\n"+t2);
}
}