import java.util.Scanner;

public class StringInputPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter your name and age (John 30)");

        //read string from user  and get rid of spaces
        //get substring of last two aharacters in the string
        //convert those to integer
        //if age is over 70, then print "senior" if not "adult"
        String input = scanner.nextLine().trim();
        System.out.println("Substring " + input.substring(input.length()-2));
        int age = Integer.parseInt(input.substring(input.length()-2));
        if (age > 70) {
            System.out.println("Senior");
        } else {
            System.out.println("Adult");

        }
    }
}
