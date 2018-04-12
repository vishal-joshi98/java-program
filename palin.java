import java.util.*;
class palin
{
  public static void main(String arg[])
   {
   	int a,rem,rev=0;
   	Scanner input=new Scanner(System.in);
   	System.out.println("\n enter the  no");
   	a=input.nextInt();
       int k=a;
       while(a!=0)
       {
         rem=a%10;
         rev=rev*10+rem;
         a=a/10;
       }
       System.out.println((rev==k) ? k+"  no is palindrom" : k+" no is not palindrom");
   	
   }
}


