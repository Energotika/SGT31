import java.util.Scanner;

public class LeapYearMethod {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year");
        year = scanner.nextInt();
        if((year % 4 == 0 && % 100 != 0) || year % 400 == 0){
            System.out.println((year + "is a leap year");
        } else {
            System.out.println((year + "is not a leap year");
        }

    }
}
