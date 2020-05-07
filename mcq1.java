class NValueIs
 {

static int num1=1;
static int num2=2;
 public static void swap(int n1,int n2) {
 
     int temp = n1;
 
	System.out.print(n1+" "+n2);
       n1 = n2;

        n2 = temp;
   
 }    public static void main(String[] args)
 {

       // int num1 = 1;

        //int num2 = 2;

	NValueIs c=new NValueIs();
        System.out.println("Before swap method, num1 is " + num1 + " and num2 is " + num2);
 
        swap(num1, num2);

        System.out.println("After swap method, num1 is " + num1 + " and num2 is " + num2);

  }

   
}
