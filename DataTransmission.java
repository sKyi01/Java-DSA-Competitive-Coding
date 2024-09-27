import java.util.Arrays;

public class DataTransmission {

    public static void main(String[] args) {

        int[] arr = { 233, 2435, 1123, 109, 103, 4434, 2347, 993, 880, 1117, 1801, 991 };
        int[] primeArray = new int[arr.length];
        int count = 0;
        int index = 0;

        for (int i : arr) {
            count = isPrime(i);
            if (count == 2) {
                primeArray[index] = i;
                index++;

            }
        }
        Arrays.sort(primeArray);

        for (int i : primeArray) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(primeArray[primeArray.length - 2]);
        System.out.println(index);

        System.out.println("Answer : " + (primeArray[primeArray.length - 2] + index));

    }

    public static int isPrime(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }

        }

        return count;

    }

}
