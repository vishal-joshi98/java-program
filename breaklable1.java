import java.util.*;
public class breaklabel
{
	public static void main(String arg[])
	{
		int i,j;
		outer:
		 for(i=0;i<3;i++)
		 {
		 	System.out.println("outer"+i);
		 	inner:
		 	 for(j=1;j<3;j++)
		 	 {
		 	 	System.out.println("inner"+j);
		 	 	 if(i==j)
		 	 	 	break outer;
		 	 	 System.out.println("bye");
		 	 }
		 }
	}
}