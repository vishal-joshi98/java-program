class variable2
{static int y;
  int x=0;
 variable2()
{
x++;
System.out.println(x);
}
 public static void main(String[] sk)
{
variable2 v1=new variable2();
variable2 v2=new variable2();
variable2 v3=new variable2();
variable2 v4=new variable2();
variable2 v5=new variable2();
variable2 v6=new variable2();
 //if used without initialization will give error(int x)
System.out.print(y);


}
}