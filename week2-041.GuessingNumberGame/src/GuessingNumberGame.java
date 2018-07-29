
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberGuessed;
        int guessMade = 0;
        // program your solution here. Do not touch the above lines!

        while (true) {
            System.out.print("Guess a number: ");
            numberGuessed = Integer.parseInt(reader.nextLine());
            guessMade++;
            
            if (numberGuessed == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberGuessed > numberDrawn) {
                System.out.println("The number is lesser, guess made: " + guessMade);
            } else {
                System.out.println("The number is greater, guess made: ");
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
