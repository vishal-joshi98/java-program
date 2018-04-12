import java.util.*;
class rightshift

{
    /*{  a=2;
    a<<n;
    then a=a*2^n  }*/
   //always take 32 bit in this 
    //for usigned right shift 
    public static void main(String args[])
    {
    	//For positive number ,>> and >>> works same
    	/*~30 30=11110   now take 8 bit=00011110
           now take inverse "1"(for magnitude)110001
           take 2 compliment=001111=-31;*/
    }
}

class primno
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the no which you want to check");
		int a=input.nextInt();
		int i;
         int c=0;
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
				{
					c++;
				}
 
		}
		System.out.println((c>2)?("not prime"):("prime"));
	}
}