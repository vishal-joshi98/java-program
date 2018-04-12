import java.time.*;
public class localdate
{
	public static void main(String arg[])
	{
		LocalDate date=LocalDate.now();
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=yesterday.plusDays(2);
		System.out.println(date+" "+yesterday+" "+tomorrow);
	    LocalDate date1=LocalDate.of(2017,1,13);//LocalDate.of()  
	    System.out.println(date1.isLeapYear());
	    LocalDate date2=LocalDate.of(2016,9,23);
	    System.out.println(date2.isLeapYear());
	    LocalDate date3=LocalDate.of(2017,1,13);
	    LocalDateTime datetime=date3.atTime(1,50,9);
	    System.out.println(datetime);

	    /// wap which prompts the user to enter a date using command-line argument and the number of 
	    //year ,moths and days

	    // que 2 now  find out the day after that many day,year and month from the entered date

	}
}