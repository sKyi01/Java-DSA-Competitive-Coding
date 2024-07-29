import java.util.*;

public class SmallestNumberInArray {

    public static void main(String[] args) {

        int[] arr = { 65, 65, 32, 54, 12, 54, 101, 23, 75 };
        int min = arr[0];
        int len = arr.length;

        // Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i]);
            if (arr[i] > min) {

                min = arr[i];
            }

        }

        System.out.println("Smallest number is : "+ min);

    }
}