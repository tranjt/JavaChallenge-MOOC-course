
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        gradeDistribution(lukija);
    }

    public static void gradeDistribution(Scanner scanner) {
        int[] scores = new int[6];
        int nextInt;
        while (true) {
            nextInt = Integer.parseInt(scanner.nextLine());
            if (nextInt == -1) {
                break;
            } else if (60 >= nextInt && nextInt >= 50) {
                scores[5]++;
            } else if (49 >= nextInt && nextInt >= 45) {
                scores[4]++;
            } else if (44 >= nextInt && nextInt >= 40) {
                scores[3]++;
            } else if (39 >= nextInt && nextInt >= 35) {
                scores[2]++;
            } else if (34 >= nextInt && nextInt >= 30) {
                scores[1]++;
            } else if (29 >= nextInt && nextInt >= 0) {
                scores[0]++;
            }
        }

        printGrade(scores);

    }

    public static void printGrade(int[] grades) {
        int allScores = 0;
        int accepted = 0;
        System.out.println("Grade distribution:");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);

            if (i > 0) {
                accepted += grades[i];
            }
            allScores += grades[i];
        }

        System.out.println("Acceptance percentage: " + 100.0 * accepted / allScores);
    }

    public static void printStars(int stars) {

        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
        System.out.println("");
    }
}
