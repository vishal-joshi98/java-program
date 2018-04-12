abstract class Person
{
	abstract void eat();
}
class TestAnonymousinner
{
	public static void main(String arg[])
	{
		//inside a method(main) only ,anonymous class is declared 
		Person p=new Person() // Statement do not end with semicolon (as we cant create object for abstract class or interface )
		{
			void eat()
			{
				System.out.println("nice fruits ");

			}
		};
		p.eat();
		Person p2=new Person()
		{
			void eat()
			{
				System.out.println("hii");
			}
		};
		p2.eat();

	}
}