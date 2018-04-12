import java.io.*;
 class SerializationDemo
{
	public static void main(String[] args) {
		try
		{
		  Students obj1=new Students("Rahul",71,2.70);
		  System.out.println("object1:"+obj1);
		  FileOutputStream fos=new FileOutputStream("se.txt");
		  ObjectOutputStream oos=new ObjectOutputStream(fos);
		  oos.writeObject(obj1);
		  oos.flush();
		  oos.close();

		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
}