import java.time.*;
import java.time.format.*;
public class datetimeformater
{
 public static void main(String[] args) 
   {

   	LocalDateTime datetime1=LocalDateTime.now();
   	DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MMyy HH:mm:ss");
   	String formatDateTime=datetime1.format(format);
   	System.out.println(formatDateTime);
		
	}
}