public class Greater {
    public static void main(String[] args) {

        int[] arr = { 5, 6, 7, 4, 8, 3, 2 };
        int temp = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (temp < arr[i]) {
                count++;

            }
            temp = arr[i];

        }

        System.out.println(count);

    }
}
