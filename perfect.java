//import java.util.*;
class perfect
{
	public static void main(String []arg)
	{
		int i,j,sum=1;
		System.out.println("perfect no =");	
		for(i=2;i<=1000;i++)
		{    sum=1;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
		
			}
			if(sum==i)
			{ 
				System.out.println(i);
		     
		     }
		    
		}

	}
}