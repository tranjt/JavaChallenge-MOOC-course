import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
                System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nameLenght = name.length();
        
        String revString = "";
        while (nameLenght > 0) {
            nameLenght--;
            revString += name.charAt(nameLenght);
        }
         System.out.println("In reverse order: " + revString);
    }
}
