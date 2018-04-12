import java.util.*;
//type 1st of lambda
interface a
{
	int add(int a1,int b1);
}
class lambda1
{
	public static void main(String[] args) {
		a obj1=(int a1,int b1)->
		{
 			return(a1+b1); 
		};
		System.out.println("addition ="+obj1.add(3,6));
	}
}
//type 2
interface b{
	String name();
}
class lambda2
{
	public static void main(String[] args) {
		b obj2=()->("Vishal");
	
	System.out.println("name ="+obj2.name());
}
}
//type3 lmbda example

interface c
{
	String name1(String n);
}
class lambda3
{
	public static void main(String[] args) {
		c obj3=n->(n+"joshi");
         System.out.println("your name="+obj3.name1("vishal"));
	}

}
//type 4
interface d
{

	int airthmatic(int a2,int b2);
}
class lambda4
{
	public static void main(String[] args) {
		d a=(a2,b2)->(a2+b2);
		
		System.out.println("addition="+a.airthmatic(4,6));
		
		a.airthmatic(3,4);
		
		d m=(int a2,int b2)->(a2*b2);
		
		System.out.println("multiplication="+m.airthmatic(6,7));
          
         d s=(a2,b2)->(a2-b2);
         System.out.println("subtracion="+s.airthmatic(9,8));
   
   		d div=(a2,b2)->(a2/b2);
       System.out.println("divison ="+div.airthmatic(8,4));

}
}
	
//factorial
interface factorial
{
	void fact();

}
class find
{
	public static void main(String[] args) {
		
        		factorial f=()->
	{
          
          int f1=1;
         Scanner s1=new Scanner(System.in);
         System.out.println("enter the no for factorial");
         int a=s1.nextInt();
        for(int i=1;i<=a;i++)
        {
        	f1=f1*i;
        }
        System.out.println("factorial="+f1);
        
         
     };

     f.fact();
       
    

}
}
