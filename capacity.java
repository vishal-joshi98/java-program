import java.lang.StringBuilder;
class capacity
{
	public static void main(String arg[])
	{
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//default 16
		sb.append("hello");
		System.out.println(sb.capacity());//now 16
		sb.append("java is my favourite langauage  ");
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (old capacity*2)+2

	}
}