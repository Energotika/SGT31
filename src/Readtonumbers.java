import java.util.Scanner;

public class Readtonumbers {
    /*Write an application, that will read two numbers from user (of type int)
and will print true, if both numbers are the same sign (both are positive,
or both are negative), or false otherwise. If at least one of given numbers
is equal to 0, your application should print false.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number!");
        int input1 = scanner.nextInt();

        System.out.println("Please enter secound number!");
        int input2 = scanner.nextInt();
        //if both are positive input or and && input1 > 0 input2 > 0
        //input1 < 0 && input 2 < 0, 2 verical sighns OR, && and

        if((input1 > 0 && input2 >0) || (input1 < 0 && input2 < 0)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
