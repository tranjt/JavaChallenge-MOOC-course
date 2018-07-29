
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nameLenght = name.length();
        int count = 0;
        while (nameLenght > count) {
            System.out.println((count+1) + ". character: " + name.charAt(count));
            count++;
        }

    }
}
