import java.io.*;
class file1
{
	public static void main(String[] args) {
		try
		{
			Students obj2;
			FileInputStream fis=new FileInputStream("se.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			obj2=(Students)ois.readObject();
			ois.close();
			System.out.println("object2:"+obj2);

		}
		catch(Exception e)
		{
			System.out.println("Exception during deserialization"+e);
			System.exit(0);

		}
	}
}