public class DigitSum {

    public static void main(String[] args) {
        int n = 54453;
        int sum = 0;

        while (n != 0) {
            sum += n % 10; // Add the last digit to sum
            n = n / 10;    // Remove the last digit from n
        }

        System.out.println("Sum of digits: " + sum);
    }
}
