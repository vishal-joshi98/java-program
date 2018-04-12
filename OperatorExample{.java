class OperatorExample
{  
public static void main(String args[]){  
    //For positive number, >> and >>> works same  
    //System.out.println(20>>2);  
   // System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    //System.out.println(-20>>2);  
   // System.out.println(-20>>>60);  
  int x = 10, y = 5;
while(x-- > 7 || + + y < 8 )
System.out.print(x);
System.out.print(y);

}}