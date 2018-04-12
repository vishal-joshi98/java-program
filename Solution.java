import java.util.*;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {    String s1=sc.next();
                int x=sc.nextInt();
             String s= String.valueOf(x);
               
                //Complete this line
                int l=s1.length();
                System.out.print(s1);
                for(int j=l;j<=15;j++)
                { 
                    System.out.print(" ");
                }
                 int k=s.length();
                System.out.println((k==3) ? s:(k==2) ? "0"+s :(k==1)? "00"+s :"000");
            }
            System.out.println("================================");

    }
}
