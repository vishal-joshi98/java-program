public class localinner1
{
	private  int data=30;//instance variable 
	void display()
	{
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	}
	public static void main(String arg[])
	{
		localinner1 obj=new localinner1();
		obj.display();
	}
}