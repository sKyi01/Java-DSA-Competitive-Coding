import java.util.Scanner;

public class ArrayParkingOnes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int row = sc.nextInt();

        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        int countOnes = 0;
        int index = 0;
        int max = 0;
        int rowCount = 0;

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(arr[i][j]);

            }
            System.out.println();

        }

        for (int i = 0; i < row; i++) {
            countOnes = 0;
            for (int j = 0; j < col; j++) {

                if (arr[i][j] == 1) {
                    countOnes++;
                }

                if (countOnes > max) {
                    max = countOnes;
                    index = i + 1;
                }

            }
        }

        // System.out.println("Appearing maximum 1 in a row is :" + max);

        System.out.println("Full parking row is :" + index);

    }

}
