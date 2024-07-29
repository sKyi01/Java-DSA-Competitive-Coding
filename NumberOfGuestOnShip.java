import java.util.Scanner;

public class NumberOfGuestOnShip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int max=0;
        
        int totalGuestOnShip = 0;

        System.out.println("Enter Time Period");

        int time = sc.nextInt();

        int[] arr1 = new int[time];
        int[] arr2 = new int[time];

        System.out.println("Enter coming guest ");

        for (int i = 0; i < time; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter Out going guest ");

        for (int i = 0; i < time; i++) {
            arr2[i] = sc.nextInt();

        }

        for (int i = 0; i < time; i++) {

            temp = temp + (arr1[i] - arr2[i]);
            totalGuestOnShip = temp;

            if(totalGuestOnShip>max){
                max=totalGuestOnShip;
                
            }

        }

        System.out.println("Total Guest on Ship \n"+  max);

    }

}