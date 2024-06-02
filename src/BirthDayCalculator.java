import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthDayCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in) ; 
		
		System.out.println("please enter your birthday");
		
		String birthdayOfTheUser = scanner.nextLine(); 
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		
		LocalDate birthday = LocalDate.parse(birthdayOfTheUser,formatter); 
		
		System.out.println("hello this is the birthday "+birthday);
		
		LocalDate today = LocalDate.now(); 
		
		Period age =  Period.between(birthday,today);
		
		int years = age.getYears(); 
		
		int month = age.getMonths();
		
		int days = age.getDays(); 
		
		int TheDayIBorn = birthday.getDayOfYear(); 
		
		System.out.println(" you were born on a "+TheDayIBorn);
		System.out.println("you are"+ years +" years "+ month + "Months "+days + " days ");

	}

}
