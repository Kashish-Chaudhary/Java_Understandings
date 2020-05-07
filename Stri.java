class Stri
{
public static void main(String kashish[])
{
char c[]={'a','1','b',' ','A','0'};
for(int i=0;i<5;++i)
{
if(Character.isDigit(c[i]))
System.out.println(c[i]+"is digit");

if(Character.isWhitespace(c[i]))
System.out.println(c[i]+"is digit"+"is space");

if(Character.isUpperCase(c[i]))
System.out.println(c[i]+"is uc");

if(Character.isLowerCase(c[i]))
System.out.println(c[i]+"is lc");
i=i+3;
}
}
}