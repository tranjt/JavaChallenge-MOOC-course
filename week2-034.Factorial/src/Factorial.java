import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        int firstNumber = 1;
        int sum = 1;
        while (firstNumber <= lastNumber) {
         
            sum *= firstNumber;         
            firstNumber++;
        }
        System.out.println("Sum is " + sum);

    }
}
