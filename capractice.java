import java.util.*;
abstract class  person
{
	abstract void data(String a,String s,String n);
}
class student extends person
{
    void data(String name,String age,String classname)
   {
      System.out.println("student name ="+name);
      System.out.println("age="+age);
      System.out.println("section="+classname);
      //System.out.println("you are in student subclass");
   }
}
class employe extends person
{
	 void data(String name,String age,String post)
     {
       System.out.println("Employe name="+name);
       System.out.println("Employe age="+age);
       System.out.println("Employe post="+post);
     }

}
class detail
{
	public static void main(String[] args) {
	      student s1=new student();
	      employe s2=new employe();
	      Scanner input=new Scanner(System.in);
	      System.out.println("Enter the name of student age and section");
	      String n=input.nextLine();
	      String a=input.nextLine();
	      String s=input.nextLine();
	      System.out.println("enter the name age and post of employee");
	      String n1=input.nextLine();
	      String a1=input.nextLine();
	      String p=input.nextLine();
	      s1.data(n,a,s);
	      s2.data(n1,a1,p);
	}
}