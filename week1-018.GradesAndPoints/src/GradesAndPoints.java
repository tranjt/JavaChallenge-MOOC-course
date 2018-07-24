
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.err.print("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());

        if (60 >= grade & grade >= 50) {
            System.out.println("Grade: 5");
        } else if (49 >= grade & grade >= 45) {
            System.out.println("Grade: 4");
        } else if (44 >= grade & grade >= 40) {
            System.out.println("Grade: 3");
        } else if (39 >= grade & grade >= 35) {
            System.out.println("Grade: 2");
        } else if (34 >= grade & grade >= 30) {
            System.out.println("Grade: 1");
        } else {
            System.out.println("Grade: failed");
        }
    }
}
