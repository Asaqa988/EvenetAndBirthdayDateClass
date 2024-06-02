import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventCalculator {

	public static void main(String[] args) {
		
		LocalDateTime eventTime = LocalDateTime.of(2024,06,03,22,30); 
		
LocalDateTime CurrentDate = LocalDateTime.now(); 

Duration duration = Duration.between(eventTime, CurrentDate); 
//System.out.println(duration);

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd mm yyyy");
//DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy,MM,dd");
//
String formattedDate = eventTime.format(formatter);
//String formattedDate2 = eventTime.format(formatter2);
//String formattedDate3= eventTime.format(formatter3);
//String formattedDate4= eventTime.format(formatter4);
//
//System.out.println(formattedDate);
//System.out.println(formattedDate2);
//
//System.out.println(formattedDate3);
//
//System.out.println(formattedDate4);

System.out.println("event is scheduled " + formattedDate);

long days = duration.toDays(); 
long hours = duration.toHours()%24 ; 
long minutes = duration.toMinutes() %60 ; 

System.out.println("time remaining till the even is " + days + "days"+hours+"Hours" + minutes +"Minutes :");


		
	}

}
