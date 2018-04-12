import java.io.*;
class Students implements Serializable
{
	String name ;
	int id;
	double d; 
	public Students(String name,int id,double d)
	
	{
		this.name=name;
		this.id=id;
		this.d=d;
	}
   public String toString()
   {
   	return "name="+name+"id="+"id="+";d="+d;
   }
	
}