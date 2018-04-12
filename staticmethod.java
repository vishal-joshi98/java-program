 class a
{
	static void display()
	{
		System.out.println("you are iin base satic method");

	}

}
class b extends a
{
      void display1()
      {
        System.out.println("you are iin subclass  satic method");      	
      }
}
class d
{
	public static void main(String[] args) {
			a obj=new b();

			b.display();

	}
}