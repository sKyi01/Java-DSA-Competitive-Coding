

public class TwoSumArrayIndex {

    public static void main(String[] args) {


        int[] arr = new int[8];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 4;
        arr[3] = 3;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;


        int target = 9;


        for (int i = 0; i < arr.length; i++) {


            System.out.println("array index wise element arr["+i+"] : "+arr[i]);

        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < i; j++) {


                if (arr[i] + arr[j] == target) {
                    System.out.println("indexes are : " +"arr[ "+ i+" ]"+" arr[ "+ + j+" ]");


                }


            }

        }


    }

}
