import java.util.*;
class patt1
{   public static void main(String []arg)
	{ 	int i,j;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter the no");
    	int n=input.nextInt();
    	for(i=1;i<=n;i++)
    	{
    		for(j=1;j<=i;j++)
    		{
    			System.out.print(" "+j);
    		}
       	System.out.println(" ");
    }	}
 }

 class patt2
{   public static void main(String []arg)
	{ 	int i,j;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter the no");
    	int n=input.nextInt();
    	for(i=n;i>=1;i--)
    	{
    		for(j=1;j<=i;j++)
    		{
    			System.out.print(" "+j);
    		}
       	System.out.println(" ");
    }	}
 }



 class patt3
{   public static void main(String []arg)
	{ 	int i,j;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter the no");
    	int n=input.nextInt();
    	for(i=n;i>=1;i--)
    	{
    		for(j=1;j<=i;j++)
    		{
    			System.out.print("  "+j);
    		}
       	System.out.println("  ");

    	 for(j=1;j<=((n-i)*2)+1;j++)
    		{
                 System.out.print(" ");
   			}
        }
    }
 }

  class patt4
{   public static void main(String []arg)
	{ 	int i,j;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter the no");
    	int n=input.nextInt();
    	for(i=1;i<=n;i++)
    	{   
              System.out.print("     ");
    	 for(j=1;j<=((n-i)*2);j++)
    		{
                 System.out.print(" ");
   			}
    		for(j=1;j<=i;j++)
    		{
    			System.out.print(" "+j+"  ");
    		}
       	System.out.println("  ");
        }
    }
 }


  class patt5
{   public static void main(String []arg)
	{ 	int i,j;
    	Scanner input=new Scanner(System.in);
    	System.out.println("enter the no");
    	int n=input.nextInt();
    	for(i=n;i>=1;i--)
    	{    
             System.out.println(" ");
    	     System.out.print(" ");
    	 for(j=1;j<=((n-i)*2)+1;j++)
    		{
                 System.out.print(" ");
   			}
    	for(j=1;j<=i;j++)
    		{
    			System.out.print(" "+j+"  ");
    		}
       	System.out.println("  ");

        }
           System.out.println("   ");
        	for(i=1;i<=n;i++)
    	{     System.out.println(" ");
              System.out.print("  ");
    	 for(j=1;j<=((n-i)*2);j++)
    		{
                 System.out.print(" ");
   			}
    		for(j=1;j<=i;j++)
    		{
    			System.out.print(" "+j+"  ");
    		}
       	System.out.println("  ");
        }
   
    }
 }