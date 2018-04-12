class ABC
{
  static String college="lpu";//CLASS VARIABLE
 static int x=10;
 int std_id;//INSTANCE VARIABLE
 
 public static void main(String[] sk)
{
ABC a1=new ABC();
ABC a2=new ABC();
a1.std_id=1;
a2.std_id=2;
System.out.println(a1.std_id);
System.out.println(a2.std_id);
System.out.println(college);
System.out.println(x);
System.out.println(ABC.x);
}
}