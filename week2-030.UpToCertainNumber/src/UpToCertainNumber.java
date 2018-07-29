
import java.util.Scanner;

public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Write your code here
        System.out.print("Up to what number? ");
        int upperLimit = Integer.parseInt(reader.nextLine());
        int count = 0;
        while (upperLimit > count) {
            count++;
            System.out.println(count);
        }
    }
}
