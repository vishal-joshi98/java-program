import java.util.*;
class leap
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int y;
		System.out.println("/n enter the year which youn want to enter");
		y=input.nextInt();
		boolean l=(y%4==0)&&(y%100!=0)||(y%400==0);
		System.out.println("year is leap="+l);
	}
}