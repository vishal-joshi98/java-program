//exception dosent occur
class finally1
{ public static void main(String[] args) {
       
             try
             {
             	int a;
             	a=20/1;
             	System.out.println("no error ");
             }
             catch(ArithmeticException e)
             {
             	System.out.println("exception occur");
             }	
             finally
             {
             	System.out.println("it always print");
             }
             System.out.println("rest of the code");
}
  }
  //exception occur but not handeled
 class finally2
 {
 	public static void main(String[] args) {
 		try
 		{
 			int a=20/0;
 		}
 		finally
 		{
 			System.out.println("always execute");
 		}
 		System.out.println("rest of code");

 	}
 }
 // exception occur and handeled
 class finally3
 {
 	public static void main(String[] args) {
 		try
 		{
 			int a[]=new int[5];
 			a[7]=10;

 		}
 		catch(ArrayIndexOutOfBoundsException e)
 		{
 			System.out.println("array out of range");
 		}
 		finally
 		{
 			System.out.println("always execute");
 		}
 		System.out.println("rest of the code");
 	}
 }