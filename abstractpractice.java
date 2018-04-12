abstract class bike
{
	//abstract void info();
	//abstract void info2();
}
class gear extends bike
{
	void info()
	{
       System.out.println("gear is okk");
	}
	void info2()
	{
		System.out.println("second method");
	}
}
abstract class speed extends bike
{
	/*void info()
	{
		System.out.println("speed is ok");
	}*/
}
class abstract1
{
	public static void main(String[] args) {
		//bike b=new gear();
		gear b1=new gear();
		//bike b2=new speed();
		//speed b3=new speed();
		//b.info();
		b1.info();
		b1.info2();
		//b2.info();
		//b3.info();
	}
}