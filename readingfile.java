import java.io.*;
class inputstreamdemo
{
	public static void main(String[] args)throws IOException {
		FileInputStream fis=null;//itially we have to point to null
		int i=0;
		char c;
		try
		{
			fis=new FileInputStream("v2.txt");
			while((i=fis.read())!=-1)
			{
				c=(char)i;
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			System.out.println("file not found");
		}
		
	}
}