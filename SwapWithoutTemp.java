public class SwapWithoutTemp {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap without using third variable
                    arr[i] = arr[i] + arr[j];  // a = a + b
                    arr[j] = arr[i] - arr[j];  // b = a - b (which is now a)
                    arr[i] = arr[i] - arr[j];  // a = a - b (which is now b)
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
