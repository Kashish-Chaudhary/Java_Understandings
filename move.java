import java.util.*;
class move
{
public static void main(String kashish[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
int loc=0;
	for(int i=0;i<6;i++)
	{
		a[i]=sc.nextInt();	
	}

  int j = 0; 
    for (int i = 0; i < 6; i++) { 
        if (a[i] > 0) { 
            if (i != j) {int t=a[i];a[i]=a[j];a[j]=t;}
         1 -2 5 -6      
            j++; 
        } 
   }
for(int i=0;i<6;i++)
System.out.print(a[i]+" ");
	
}
}