import java.util.*;
class fib
{
	public static void main(String []rk)
  {
  	int i=0;
    int a=0,b=1,c;
    Scanner input=new Scanner(System.in);
      System.out.println("enter the no of term fpr fiboniccai series");
      int n=input.nextInt();
      System.out.print("0"+" "+"1");
       for(i=2;i<=n;i++)
       { c=a+b;
       	a=b;
       	b=c;
       	System.out.print(" "+c);
       }
  }
}