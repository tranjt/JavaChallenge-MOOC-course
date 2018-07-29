import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    Random random = new Random();
    String chars = "abcdefghijklmnopqrstuvwxyz";
    int passwordLength;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passwordLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int count = 0;
        String newPassword = "";
        while(passwordLength > count) {
            newPassword += chars.charAt(random.nextInt(26));
            count++;
        }
        return newPassword;
    }
}
