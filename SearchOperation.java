import java.util.Scanner;

class SearchOperation {

    public static void main(String[] args) {
        int[] num = new int[6];
        num[0] = 45;
        num[1] = 54;
        num[2] = 55;
        num[3] = 65;
        num[4] = 453;
        num[5] = 344;
        System.out.println("Enter the element you want to check");
        int check = new Scanner(System.in).nextInt();

        boolean isPresent = checkPresent(num, check);
        if (isPresent) {
            System.out.println("Yes boss !! Element is present ");

        } else {

            System.out.println("No boss !! Element is not present");
        }

    }

    public static boolean checkPresent(int[] num, int check) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == check) {

                return true;
            }

        }
        return false;

    }

}
