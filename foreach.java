import java.util.*;
class foreach1
{
	public static void  main(String []arg)
	{
		//int i;
		int num[]={1,2,3,4,5};
		int sum=0;
		for(int i:num)
		{
			System.out.println("value="+i);
			sum +=i;

		}
		System.out.println("sum="+sum);	
	}
}


class foreach2
{
	public static void main(String []atrg)
	{    int i,j;
		int sum=0;
		int num[][]=new int[3][4];
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				num[i][j]=(i+1)*(j+1);
			}
		}

		for(int z[]:num)
		{
			for(int p:z)
			{
				System.out.println("value ="+p);
				sum +=p;
			}
		}
		System.out.println("sum="+sum);
	}
}