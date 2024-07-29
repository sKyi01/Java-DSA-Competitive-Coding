public class ArraySorting {

    public static void main(String[] args) {

        int[] arr = { 5, 7, 3, 4, 1, 9, 4 };
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                arr[i] = max;

            }

        }

        for(int i=0;i<arr.length;i++) {

            System.out.println(arr[i]);


        }

    }

}
