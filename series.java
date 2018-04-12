import java.util.*;
import  java .lang.*;
class series
{
	public static void main(String []arg)
	{
		Scanner input=new Scanner(System.in);
		int q,b,n,i;
		int a,j;
		
		q=input.nextInt();
		for(j=0;j<q;j++)
		{
		a=input.nextInt();
		b=input.nextInt();
		n=input.nextInt();
		  for(i=0;i<n;i++)
		  {
			a=(int)(a+(Math.pow(2,i))*b);
			System.out.print(a+" ");
		  }
		  System.out.println("");
	    }
	}

}