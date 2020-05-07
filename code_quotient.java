import java.util.*;
class Bill
{
int price,quantity;
int a,b,c,d,e;
Bill()
{
Scanner sc=new Scanner(System.in);
price=sc.nextInt();
quantity=sc.nextInt();
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
}

}
class Cash extends Bill
{int cash,bill;
	void get_cash()
		{
		cash=price*quantity;
		bill=(a*2000)+(b*1000)+(c*500)+(d*100)+(e*10);
		}
	void display()
		{
		if(bill>=cash)
		System.out.print("Clear");
		else
		System.out.print("Need to pay:"+(cash-bill));
		}


}

class code_quotient
{

public static void main(String args[])
	{
	Cash c=new Cash();
	c.get_cash();
	c.display();
	}
}