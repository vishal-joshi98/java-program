interface Eatable
{
	void eat();

}
class TestAnonymousinner1
{
	public static void main(String arg[])
	{
		Eatable e=new Eatable()//no semicolon
		{
			public void eat()
			{
				System.out.println("hii");
			}
		};
		e.eat();
	}
}