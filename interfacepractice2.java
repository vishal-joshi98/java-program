interface x
{
	void show();
}
class a implements x
{
	public void show()
	{
		System.out.println("youn are in class");
	}
}
class b implements x
{
	public void show()
	{
		System.out.println("you are in second class");
	}
}
class y
{
	public static void main(String[] args) {
		x obj=new a();
		a obj1=new a();
		b obj2=new b();
		obj2.show();
		obj.show();
		//x.show(); erroe
	}
}
//extend morethan one interface
interface a1
{
	void show();

}
interface a2 extends a1
{
	void show1();
}
interface a3 extends a1
{
	void show2();
}
class c implements a1,a2,a3
{
	public void show()
	{
		System.out.println("youare in first interface method");
	}

	public void show1()
	{
			System.out.println("youare in second  interface method");
	}

	public void show2()
	{
			System.out.println("youare in third  interface method");
	}


}
class z
{
		public static void main(String[] args) {
		c o=new c();
		o.show();
		o.show1();
		o.show2();
	}
}
