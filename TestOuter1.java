class TestOuter1
{
	static int age=20;
	static class inner
	{
		void age()
		{
			System.out.println("age="+age);
		}
		
	}
	public static void main(String[] args) {
		{
			TestOuter1.inner obj=new TestOuter1.inner();
			//TestOuter1 obj1=new TestOuter1();
			//TestOuter1.inner in=obj1.new.inner();
			obj.age();
			//in.age();
		}
	}
}