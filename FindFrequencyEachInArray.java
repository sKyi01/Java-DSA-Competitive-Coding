public class FindFrequencyEachInArray {

    public static void main(String[] args) {

        int count = 0;
        int element;

        int[] arr = { 54, 12, 56, 10, 56, 10, 1, 0, 0, 1 };

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            element = arr[i];

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

            }

            System.out.println(element +" "+ count);

        }



    }
}
