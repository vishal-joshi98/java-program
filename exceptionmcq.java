import java.io.*;
class MyException extends Exception 
{
   MyException() 
     {
        
    super("Exception Occured");
    System.out.println("he");
     }
  /* public String toString() 
     {
    return "Problem";
     }
     */
}

class Output 
{
   public static void main(String args[]) 
     {
    try {
        MyException x=new MyException();
        throw x;
        }
        catch(MyException e) 
        {
        System.out.print(e);
        }
     }
}
//example2
 class Test
{
   public static void main(String[] args)
     {
    int[] array = new int[2];
    for (int i=0; i<2; i++)
      {
       try{
        array[i] = i;
        System.out.println(i);
          }
       catch(NullPointerException e)
          {
        System.out.println("NullPointer Exception");
          }
       finally
          {
        System.out.println("Finally Executed");
        array = null;
          }
      }
     }
}
//throws


class Main {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("D:\\java program\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
        
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
        
        fileInput.close();
    }
}
