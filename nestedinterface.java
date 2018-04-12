interface a{
	void print();
	interface b{
		void show();
	}
}
class c implements a,a.b{
	public void print()
	{
		System.out.println("outer interface method");
	}
	public void show()
	{
		System.out.println("nested interface show methjod");
	}
}
class z
{
	public static void main(String[] args) {
		c obj=new c();
		obj.show();
		a obj1=new c();
		//b obj1=new c(); error
		obj1.print();
		a.b obj3=new c();
		//a obj3=new c() b obj3=new c() error
		obj3.show();
		
	}
}