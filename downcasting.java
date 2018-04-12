class animal
{}
class dog3 extends animal
{
	static void method(animal a)
	{
		if(a instanceof dog3 )
		{
			dog3 d=(dog3)a;//downcasting 
			System.out.println("ok downcasting performed");
		}
	}
	public static void main(String []arg)
	{
		animal a=new dog3();
		dog3.method(a);
	}
}