
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int smallest;
        smallest = array[0];
        for (int num : array) {
            if (smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallest = smallest(Arrays.copyOfRange(array, index, array.length));
        for (int i = index; i < array.length; i++) {
            if (array[i] == smallest) {
                return i;
            }
        }
        return 0;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
    
    public static void sort(int [] array) {
        int smallestIndex;
        for(int i = 0; i < array.length; i++) {
            smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            if (i != smallestIndex) {
                swap(array, i, smallestIndex);
            }
        }
    }

}
