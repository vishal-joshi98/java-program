class Parent{}
class Child extends Parent{}
class testinstance
{
	public static void main(String arg[])
	{
	Parent p=new Parent();
	Child c=new Child();
	System.out.println(p instanceof Child);
	System.out.println(p instanceof Parent);
	System.out.println(c instanceof Parent);
	}
}