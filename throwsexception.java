import java.util.*;
class throws1
{
	void m()throws FullException
	{
		throw new FullException("device error");

	}
	void n()throws FullException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)//catch(Throwable)
		{
			System.out.println("exception handled ");
		}

	}
	public static void main(String[] args) {
		throws1 obj=new throws1();
		obj.p();
		System.out.println("normal flow");
	}
}