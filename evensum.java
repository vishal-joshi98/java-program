import java.util.*;
class evensum
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int i=1;
		int sum=0;
		int count=0;
		while(count<=20)//for(i=1;i<=10;i++){sum=sum+i*2}
		{
			if(i%2==0)
			{
                sum=sum+i;
                count++;
 			}
 			else
 			{
 				continue;
 			}
		}
		System.out.println("first 20 even no sum="+sum);
	}
}