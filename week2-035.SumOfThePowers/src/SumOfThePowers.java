
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());
        int count = 0;
        int  result = 0;
        while ( count <= lastNumber){
            result += (int)Math.pow(2, count);
            count++;
        }
        System.out.println("The result is " + result);
    }
}
