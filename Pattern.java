public class Pattern {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

             // Print leading spaces to center the numbers
             for (int space = 0; space < 3 - i - 1; space++) {
                System.out.print(" ");
            }

            for (int j =0; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }
}
