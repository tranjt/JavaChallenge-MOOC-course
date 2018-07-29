
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();

        String newWord;
        while (true) {
            System.out.print("Type a word: ");
            newWord = reader.nextLine();
            if (words.contains(newWord)) {
                System.out.println("You gave the word " + newWord + " twice");
                break;
            }
            words.add(newWord);
        }

    }
}
