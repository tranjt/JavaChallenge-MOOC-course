
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        if (number3 > number2 && number3 > number1) {
            return number3;
        } else if (number2 > number3 && number2 > number1) {
            return number2;
        }
        return number1;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
