import java.util.Scanner;
public class Homework {


    public class HW1_2507 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of exams you passed");
            int exams = scanner.nextInt();
            exams = Math.abs(exams);

            int[] grade = new int[exams];
            int counter = 0;
            int sumGrade = 0;
            int i = 0;
            for (i = 0; i < grade.length; i++) {
                System.out.println("Please enter your grade for each exam");
                grade[i] = scanner.nextInt();
                sumGrade+= grade[i];
                counter++;
            }

            System.out.println("Your grades are ");
            i=0;
            while (i < exams){
                System.out.print(grade[i]+", ");
                i++;
            }
            float averageGrade;
            averageGrade = (float) sumGrade / counter;
            int bestGrade;
            System.out.println(" ");
            System.out.println("Please enter maximum grade for an exam");
            bestGrade = scanner.nextInt();
            if (averageGrade / (bestGrade) < (float)0.7) {
                System.out.println("Your average grade is " + averageGrade + " Try harder!");
            } else {
                System.out.println("Your average grade is " + averageGrade + " Nice work! Keep going");
            }
        }
    }
}
