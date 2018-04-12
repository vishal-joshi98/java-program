class student
{
	int roll,marks;
	String name;//data member
	student()
	{}//default constructor
	void getdata(int r,int m,String n)//methods
	{
		roll=r;//intialization
		marks=m;
		name=n;
	}
	void grace()
	{
		if( marks>=80 && marks<97)
		{
			marks=m+3;
		}
		else
		{
			System.out.println("no grace  for"+this.name);
		}
	}
	void showdata()
	{
		System.out.println("name:"+name);
	    System.out.println("roll no:"+roll);
	    System.out.println("marks:"+marks);
	}
}
class TestStudent
{
	public static void main(String ar[])
	{
		student v=new student();
		student v1=new student();
		v.getdata(1,12,"vishal");
	    v1.getdata(2,13,"joshi");
	    v.grace();
	    v1.grace();
	    v.showdata();
        v.showdata();
	 }
}
