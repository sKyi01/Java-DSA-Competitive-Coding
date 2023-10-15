// This algorithm is slowest among all sorting algorithms because of it has a highest time complexity
// Each element is compared with its exact next element and swapping is done based on ascending and descending order
// Worst case time complexity of this algorithm is O(n^2)



public class BubbleSortJava {

    public static void main(String[] args) {

        int[] arr = { 3, 6, 2, 8, 4 };
        System.out.println("Array Before Sorting");
        printArray(arr);
        arr = bubbleSort(arr);
        System.out.println("");
        System.out.println("Array After Sorting");
        printArray(arr);

    }

    public static int[] bubbleSort(int arr[]) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "-");
        }

    }

}
