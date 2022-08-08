import java.time.*;
import java.time.temporal.IsoFields;



public class DateandTimeexamples {
    public static void main(String[] args) {
        //local time
        //object creation
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now is:" + localTime);
        System.out.printf("%d/%d/%d", localTime.getHour(), localTime.getMinute(),localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withNano(0).withSecond(0);
        System.out.println(localTime1);
        //increase local time by 15min
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until: " +localTime1);

        //localdate
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is " + localDate);
        System.out.println("Year is: " + localDate.getYear());
        System.out.println("Day of the week : " + localDate.getDayOfWeek());
        System.out.println("day of the year: " + localDate.getDayOfYear()/7);
        System.out.println(localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        LocalDate localdate1 = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid first case date was: " + localdate1);
        //Localdate time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time now: " + localDateTime);

        LocalDateTime firstInternationalCatsDay = LocalDateTime.of(1997,11,20,10,45,25,0);
        System.out.println("International Cats day was started to be celabrated on: " + firstInternationalCatsDay);

        int currentMonth = firstInternationalCatsDay.getMonth().getValue();

        switch (currentMonth){
            case 11:
                System.out.println("Novembris");
                break;
            default:
                System.out.println("November");
                break;
        }
        //duration to get value in time format
        System.out.println(Duration.ofHours(10).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(firstInternationalCatsDay,localDateTime.now()).toMinutes());

        //period when want to get values in date format
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(160)).getMonths());

        //regular expressions, for checking if a string follows specific format
        //
    }
}
