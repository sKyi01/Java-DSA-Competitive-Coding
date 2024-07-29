import java.util.Scanner;

public class AddZeroFirst {

    public static void perform(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];
        int index = n - 1;

        // Traverse the array from the end and copy non-zero elements to the end of the result array
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                result[index--] = arr[i];
            }
        }

        // Fill the beginning of the result array with zeros
        while (index >= 0) {
            result[index--] = 0;
        }

        // Copy the result array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }

        // Print the result array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        perform(array);
    }
}
