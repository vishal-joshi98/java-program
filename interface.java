interface printable
{
	void print();//by defaault abstratc and public
     
}
class  A implements printable
{
	public void print()
	{
		System.out.println("hii");
	}
	public static void main(String[] args) {
		printable obj=new A();
		obj.print();
		
	}
}

//multiple inheritance using interface   
interface printable1
{
	void print();
}
interface showable
{
	void print();
}
class testinterface3 implements printable1,showable
{
	public void print()
	{
		System.out.print("hello");
		
	}
	public static void main(String arg[])
	{
		testinterface3 obj=new testinterface3();
		obj.print();
	}
}

// interface inheritance
interface printable2
{
	void print();
}
interface showable1 extends printable2
{
	void show();
}
class testinterface4 implements showable1
{
	public void print()
	{
		System.out.println("hello");

	}
	public void show()
	{
		System.out.println("hi");
	}
	public static void main(String[] args) {
		testinterface4 obj=new testinterface4();
		obj.print();
		obj.show();

	}

}


// default method in interface
interface drawable1
{
	//void draw();
	default void msg()
	{
		System.out.println("default");
	}

}
class ractangle implements drawable1
{
	//drawable d=new rectangle();
	//public void draw()
	//{
		//System.out.println("drawing rectangle");
	//}
}
class interfacedefault
{
	public static void main(String[] args) {
		drawable1 d=new ractangle();
		d.msg();
		//d.draw();
	}
}


// static method in interface
interface drawable2
{
	void draw();
	void show();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class ractangle1 implements drawable2
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	public void show()
	{
		System.out.println("second abstratc");
	}
}
class testinterfacestatic
{
	 public static void main(String[] args) {
	drawable2 d=new ractangle1();
	d.draw();
	d.show();
	System.out.println(drawable2.cube(3));

}
}


interface a{

 void show();
/*{
	System.out.println("you are iin interface 1 satic method");

}*/
}
interface b extends a
{
	public  void show ()
	{
		System.out.println("you are in interface b satic method");
	}
}
interface c extends a{
	public  void show()
	{

	System.out.println("you are iin base satic method");
     } 
}
class d
{
	public static void main(String[] args) {
	//	a.show();
		b.show();
		c.show();
	}
}