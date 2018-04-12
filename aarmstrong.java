import java.util.*;
class aarmstrong
{
	public static void main(String arg[])
	{
		int sum=0,rem,n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the for which you want check ");
		n=input.nextInt();
		int k=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		System.out.println((sum==k) ? k+"  no is armstrong" : k+" is not armstrong");
	}
}