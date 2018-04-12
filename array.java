import java.util.*;
class array
{
	public static void main(String[] arg)
	{
		int n;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of array");
	  n=input.nextInt();
	  int arr[]=new int(n);
	  System.out.println("enter the element of array");
	  for(i=0;i<n;i++)
	  {
	  	arr[i]=input.nextInt();
	  }
	  for(int i:arr)
	  {
	  	System.out.println(i);
	  }
	}
}