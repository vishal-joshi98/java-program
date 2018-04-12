import java.util.*;
class pat1
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no ");
		int a=input.nextInt();
		int i;
		int j;
         
		for(i=a;i>=1;i--)
		{
		  for(j=1;j<=i;j++)
             {
             	System.out.print(" "+j);
             }

             System.out.println();
		}
		//System.out.println((c>2)?("not prime"):("prime"));
	}
}

class pat2
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no ");
		int a=input.nextInt();
		int i;
		int j;
         
		for(i=1;i<=a;i++)
		{
		  for(j=1;j<=i;j++)
             {
             	System.out.print(" "+j);
             }
             System.out.println();
		}
		//System.out.println((c>2)?("not prime"):("prime"));
	}
}





class pat3
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no ");
		int a=input.nextInt();
		int i;
		int j;
         
		for(i=a;i>=1;i--)
		{
		  for(j=1;j<=i;j++)
             {
             	System.out.print(" "+j);
             }
                     	//System.out.print("  ");
             for(int n=1;n<=(a-i)*3;n++)
             {
             	System.out.print(" ");
             }
             for(j=1;j<=i;j++)
             {  
             	System.out.print(" "+j);
             }
             System.out.println();
	 


   		}
		//System.out.println((c>2)?("not prime"):("prime"));
	}
}
