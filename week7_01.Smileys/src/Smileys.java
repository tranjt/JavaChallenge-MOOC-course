
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        if (characterString.length() % 2 == 1) {
            printSmileys(characterString.length()/2 + 4);
            System.out.println(":) " + characterString + "  :)");            
            printSmileys(characterString.length()/2 + 4);

        } else {
            printSmileys(characterString.length() / 2 + 3);
            System.out.println(":) " + characterString + " :)");
            
            printSmileys(characterString.length() / 2 + 3);
        }

    }

    private static void printSmileys(int length) {
        while (length > 0) {
            System.out.print(":)");
            length--;
        }
        System.out.println("");
    }

}
