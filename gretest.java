import java.util.*;
class gretest
{
  public static void main(String arg[])
   {
   	int a,b,c;
   	Scanner input=new Scanner(System.in);
   	System.out.println("\n enter the three no");
   	a=input.nextInt();
   	b=input.nextInt();
   	c=input.nextInt();
   	System.out.println((a>b && a>c)? a+"gretset no":(b>a)&&(b>c) ? b+"gretest no":c+"is gretest no");
   }
}