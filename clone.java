import java.util.*;
class clone
{
	 public static void main(String[] args) 
	 {
		  // int arr1=new int[2] ;
		   //int arr2=new int[2];
		   //arr1[0]=10;
		   //arr2=arr1.clone();
		   //arr2[0]=90;
		   //System.out.print(arr1[0]+arr2[0]);
	 
		  char [] a = {'c', 'o', 'n', 'g', 'r', 'a', 't', 's'};
		  byte [] c = {82, 65, 86, 73, 75, 65, 78, 84};

		  String s1 = new String (a); System.out.println(s1);

		  String s2 = new String (a, 1,5); System.out.println(s2);

		  String s3 = new String (s1); System.out.println(s3);

		  String s4 = new String (c); System.out.println(s4);

		  String s5 = new String (c, 4, 4); System.out.println(s5);
		  
		  
char ch;
		ch = "abc".charAt(1);
		System.out.println(ch);
String s = "KAMAL";
		     char b[] = new char [10];	
		     b[0] = 'N';	 b[1] = 'E';
		     b[2] = 'E';     b[3] = 'L';
		     s.getChars(0, 4, b, 3);
		     System.out.println(b);
           String s8="vishal joshi";
           System.out.println(s8.replace('s','f'));

		
	 }
}
//CONVERT ALL DOUBLE TO INTO
//WAP TO CREATE JAGGED ARRAY IN WHICH ROWS AND COLS SHOULD BE TAKEN AS INPUT FROM USER
//WAP IMN WHICH PROMPT THE USER TO ENTER THE NUMBER OF SUNJECT AND NUMBER OF CA IN EACH SUBJECT.READ THE MARKS OF EACH CA AND STORE IN TWO DIMENSIONALARRA  PUBLIC CHAR[] FINDGRADES(DOUBLE [][]MARKS)
