
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        int dividend = Integer.parseInt(reader.nextLine());
        System.out.print("Type a number: ");
        int divisor = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + dividend + " / " + divisor + " = " + (1.0*dividend/divisor));
    }
}
