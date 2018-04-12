public class throw1
{
	static void validate(int age)
	{
		try
		{if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("handeled");
	    }

	}
	public static void main(String[] args) {
		validate(15);
		System.out.println("rest of the code");
	}
}