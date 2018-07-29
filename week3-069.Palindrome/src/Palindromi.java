import java.util.Scanner;

public class Palindromi {
    
        public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String revText = "";
        int textLength = text.length();
        while ( textLength  > 0 ) {
            textLength--;
            revText+= text.charAt(textLength);
        }
        return revText;
    }


    public static boolean palindrome(String text) {
        // write code here
        String revString = reverse(text);
        if (revString.equals(text)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
