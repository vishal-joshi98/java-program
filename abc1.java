
 class Bike
{  
int speedlimit=90;  
}  
class abc1 extends Bike
{  
 int speedlimit=150;  
 public static void main(String args[])
{  
Bike obj=new abc1();  
System.out.println(obj.speedlimit); //90  
}  
}


