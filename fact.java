import java.util.*;
class fact
{
	public static void main(String ar[])
	{
		int n;
		int fact=1;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no for which you want to calculate the factorial=:)");
		 n=input.nextInt();
		int k=n;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("factorial of no"+" "+k+"="+fact);


	}
}