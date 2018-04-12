class shape
{
	void draw()
	{
		System.out.println("drawing..");
	}
}
class rectangle extends shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("drwing circle");
	}
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("drawing triangle");
	}
}
class testpolymorphism
{
	public static void main(String[] args) 
	{
	shape s;
	s=new rectangle();
	s.draw();
	s=new circle();
	s.draw();
	s=new triangle();
	s.draw();	
	}
}