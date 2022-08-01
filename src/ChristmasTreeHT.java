import java.util.Scanner;

public class ChristmasTreeHT {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter tree size");
        int size = scanner.nextInt();

        for(int i = 0; i < size; i++){
            for(int j =0; j < size - 1 -i; j++){
                System.out.print(" ");
            }
//stars
            for(int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

            }
        //base level
        for(int i = 0; i < size - 1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
        }
    }

