import java.util.*;
//example 1
class assertionexample
{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the age");
		int age=scanner.nextInt();
		try
		{
		assert age>=18:"Not valid"; 
		}
		catch(AssertionError e)
		{
			System.out.println(e);
		}
		System.out.println("you are eligible for voting"+age);
	}
} 

//gretest among three no
class assertionexample1
{
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the 1st 2nd and 3rd no");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		assert (a<b || a<c):"largest="+a;
		assert (b<a || b<c):"largest ="+b;
		assert (c<a || c<b):"largest="+c;
		
	}
 } 