
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a first word: ");
        String firstWord = reader.nextLine();

        System.out.print("Type a sechond word: ");
        String sechondWord = reader.nextLine();
        
        if (firstWord.contains(sechondWord)) {
            System.out.println("The word '" + sechondWord + "' is found in the word '" + firstWord +"'" );
        }else {
            System.out.println("The word '" + sechondWord + "' is not found in the word '" + firstWord +"'" );
        }
        
    }
}
