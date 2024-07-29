public class CheckPrimeNumber {

    static int count = 0;

    public static int isPrime(int n) {

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                count++;

            }
        }

        return count;

    }

    public static void main(String[] args) {

        int a = 10;

        isPrime(a);

    

        if (count == 2) {

            System.out.println("Its Prime Number");

        } else {
            System.out.println("Its Not a Prime Number");

        }

    }

}
