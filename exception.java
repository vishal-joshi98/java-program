class ex1
{
	public static void main(String[] args) {
		try
		{
			int a=50;
			int d=0;
			int c=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("over");
	}
}
//multiple catch
class ex2
{
	public static void main(String[] args) {
		try
		{
				int a[]=new int[5];
			//a[7]=30;
			int b=40/0;
		
			String s=null;
			System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array out of bound");
		}
		catch(ArithmeticException e)
		{
		 System.out.println("zero divison error");	
		}
		catch(NullPointerException e)
		{
			System.out.println("null pointer exception");
		}
		catch(Exception e)
		{
		System.out.println("by default exception handler");
		}
		System.out.println("end of the program");
	}
}