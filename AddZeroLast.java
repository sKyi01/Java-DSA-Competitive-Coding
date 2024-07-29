import java.util.Scanner;

public class AddZeroLast {

    public static void addToLast(int[] arr) {

        int pos = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }

        }

        while (pos < arr.length) {
            arr[pos++] = 0;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

        }

    }

    public static void main(String[] args) {

        int[] arr = new int[6];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        addToLast(arr);

    }

}