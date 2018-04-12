interface x
{
	//void test();
	default void demo()
	{
		System.out.println("you are in interface x default method");
	}
	static void show()
	{
		System.out.println("you are in interface x static method");
	}
}
interface y
{
	void test();
	default void demo1()
	{
		System.out.println("you are in interface y default method");
	}

}
abstract class a implements x,y
{
	public void test()
	{
		System.out.println("you are in class a abstract method of interface x and y");

	}
	public void test1()
	{
		System.out.println("you are in class a abstract method of interface x and y");

	}

    abstract int add(int a,int b);
    
}
class z extends a
{    int add(int a,int b)
	{
		return a+b;
	}	
    public static void main(String[] args) {
		z obj =new z();
		System.out.println(obj.add(9,8));
		obj.test();
		x.show();
		obj.demo1();
		obj.demo();
		//z.show();erro
		//x obj1=new z();
		//y obj2=new z();
		//x.demo();error
}}