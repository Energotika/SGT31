import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*...*/
//for loop
        for(int i = 0; i < 10; i++){
            System.out.println("Hello World");
        }
        //while loop
        int i = 0;
        while (i < 10){
            System.out.println("Hello World!");
            i++;
            //no ; needed after start, bad example of while loop
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int input = scanner.nextInt();

        while(input != 0){  //!= not equal to 0
            System.out.println("Please enter any number");
            input = scanner.nextInt();
        }

        //do while loop
        int j = 10;
        while (j<10){
            System.out.println("This is While loop");
        }
        do{
            System.out.println("This is DO while loop");
        }while (j<10);
        }
}
