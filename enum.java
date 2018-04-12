//enum season {}
class enumdemo
{ 
	public enum season {summer,winter,spring}
  public static void main(String ar[])
  {
   for(season s : season.values())
   {
   	System.out.println(s);
   }

  }
}
//write a program to create a class bank account having instance  variable balance
//implement a method deposit(int amt) which receives the amount to be deposit as an argument and adds to the current balance
//implement  another method int withdraw() which asks the user to enter the amount to be withdrawn and updates the balance if having sufficient balance and return the new balance
//invoke both the methods fro testbankaccount()
//write a program to create a class named patientwhich contains
// a attributes patient_name ,age,