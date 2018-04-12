//comparing two string 
// 1 equals(string name) for comparision
//equalsIgnoreCase(string name)
// ==     compares reference not values 
//(==) new String  get different location in memory in case of same string
// (==)String("string name")   in this case same memory location becase string literal
// s1="sachin"  s2="sachin"  "references same   same memory location"
// s1="sachin"   s2=new String(sachin)   not same reference   different memory location
// startswith()  endswith()   ans in true false
public class string{
	public static void main(String []arr)
	{
		String s="Hello Students.";
	    String s1="Hello students.";
	    System.out.println(s.charAt(3));
        System.out.println(s.startsWith("hello"));
        System.out.println(s.endsWith("ents."));
        boolean b=s.endsWith("ents.");
        System.out.println(b);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.length());
        System.out.println(s1.indexOf('s'));
        System.out.println(s1.indexOf('s',10));
        System.out.println(s1.lastIndexOf('s'));
        String ss="one,two,three";
        String[] sa=ss.split(",");
        System.out.println(sa[0]);    
		System.out.println(sa[1]);
		System.out.println(sa[2]);
		String str="Hello World";
		int length =str.length();
		 System.out.println("length of a string :"+length);
		 String s11="Welcome to java";
		 String s2 =new String("Welcome to Java ");
		 String s3="Welcome to Java";
		 String s4=new String("Welcome to Java");
		 System.out.println("s11==s2 is"+(s11==s2));
		 System.out.println("s11==s3 is"+(s11==s3));
		 System.out.println("s11==s4 is"+(s11==s4));
		 String s5=new String("Welcome");
		 String s6="Welcomeab";
		 if(s5.equals(s6))
		 {
		 	System.out.println("s5 and s6 have the same contents.");
		 }
		 if(s5==s6)
		 {
		 	System.out.println("s5 and s6 have the same reference.");

		 }
		 if(s5.compareTo(s6)>0)
		 {
		 	System.out.println("s5 is greter  than s6 "+s5.compareTo(s6));
		 }
		 else if(s5.compareTo(s6)==0)
		 {
		 	System.out.println("s5 and s6 have the same contents."+s5.compareTo(s6));
		 }
		 else
		 {
		 	System.out.println("s5 is less than s6 "+s5.compareTo(s6));
		 }


	}
}