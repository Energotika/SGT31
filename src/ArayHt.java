import java.util.Scanner;

public class ArayHt {
    public static void main(String[] args){

        System.out.println("Enter the required size of the array :: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int myArray[] = new int [size];

        for(int i = 0; i < size; i++){
            System.out.println("Please enter element number: " + (i+1));
            int input = scanner.nextInt();

        }
        System.out.println("Source Array:");
        for(int i = 0; i < size; i++){
            System.out.print(myArray[i] + " ");
        }
        //Printing out all array's elements using For - each loop
        System.out.println("Source Array:");
        for(int temp : myArray){
            System.out.print(temp + " ");

        }
        }
}
