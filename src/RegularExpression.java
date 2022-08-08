import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("a+bcd");
        Matcher matcher = pattern.matcher("abcd");
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
        //any lower case letter accepted or any number from 5 to 9
        System.out.println(Pattern.matches("[a-z5-9]{3}","568"));

        //example hp - 5742,po6335, fr-23, kc-2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your car's plate number");
        String plateNumber = scanner.nextLine().trim();

        Pattern pattern1 = Pattern.compile("[A-Z]{2}-[0-9]{1,4}");
        Matcher matcher1 = pattern1.matcher(plateNumber);
        boolean correctPlate = matcher1.matches();
        if(correctPlate) {
            System.out.println("Yur inputted plat number is correct");
        }else {
            System.out.println("Your inputted plate number is not correct");
        }

    }
}
