
import java.util.Scanner;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zun
 */
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement:");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        System.out.println("");

        String statement, word, translation;
        while (true) {
            System.out.print("Statement:");
            statement = this.reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Chears!");
                break;
            } else if (statement.equals("add")) {
                System.out.print("In Finnish: ");
                word = this.reader.nextLine();
                System.out.print("Translation: ");
                translation = this.reader.nextLine();
                this.dictionary.add(word, translation);

            } else if (statement.equals("translate")) {
                System.out.print("Give a word");
                word = this.reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(word));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

}
