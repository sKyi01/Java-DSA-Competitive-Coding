public class WithoutTempSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 9, 3, 5, 7};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
