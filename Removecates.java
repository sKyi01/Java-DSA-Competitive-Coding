public class Removecates {

    public static boolean checkDupliicates(int n, int arr[]) {

        boolean check = false;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {

                check = true;

            }
        }

        return check;

    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,3,3,4,4,5,5,6,6,7,7 };
        int[] arr2 = new int[arr.length];
        int j=0;

        for (int i = 0; i < arr.length; i++) {

            if (!checkDupliicates(arr[i], arr2)) {

                arr2[j] = arr[i];
                j++;

            }

        }

        for (int i = 0; i < j; i++) {
            System.out.print(arr2[i] + " ");

        }
       
    }
}
