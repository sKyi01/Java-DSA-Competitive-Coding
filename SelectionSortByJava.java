public class SelectionSortByJava {

    public static void main(String[] args) {

        int[] arr = { 54, 4, 6, 34, 67, 23, 65, 234, 324, 45, 3464, 24345, 65, 3 };
        System.out.println("Before Sorting");
        printArray(arr);
        int[] sortedArray = selectionSort(arr);

        // printing arrays
        System.out.println();
        System.out.println();

        System.out.println("After Sorting");
        printArray(sortedArray);

    }

    public static int[] selectionSort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
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

            System.out.print(" - " + arr[i]);
        }

    }

}
