abstract class Shape
{
	abstract void draw();//it have to be implement in subclass or derived class
     static void show()
     {
     	System.out.println("in static");
     }
}
class rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle1 extends Shape{
	void draw()
	{
		System.out.println("drawing circle");	
	}
}
class abstract1
{ public static void main(String[] args) {
		Shape s=new circle1();
		//Shape s2=new Shape();  error can not be instantiated
		circle1 s2=new circle1();
		s2.draw();
		s2.show();
		circle1.show();
		s.draw();
	}
}