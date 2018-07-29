
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
         ArrayList<String> words = new ArrayList<String>();
        String newWord;

        while (true) {
            System.out.print("Type a word: ");
            newWord = reader.nextLine();

            if (newWord.isEmpty()) {
                break;
            }
            words.add(newWord);
        }
        System.out.println("You typed the following words: ");
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
