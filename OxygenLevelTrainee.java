import java.util.Scanner;

public class OxygenLevelTrainee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int avg = 0;
        int max = Integer.MIN_VALUE;

        int[] round1 = new int[3];
        int[] round2 = new int[3];
        int[] round3 = new int[3];

        int[] fit = new int[3];

        System.out.println("Enter Oxygen Level of Trainees per round");

        for (int i = 0; i < 3; i++) {
            round1[i] = sc.nextInt();
           
          
        }


        for (int i = 0; i < 3; i++) {

            round2[i] = sc.nextInt();

        }
        for (int i = 0; i < 3; i++) {

            round3[i] = sc.nextInt();

        }

        for (int i = 0; i < 3; i++) {

            fit[i] = (round1[i] + round2[i] + round3[i]) / 3;

        }

        for (int i = 0; i < 3; i++) {

            if (max < fit[i]) {
                max = fit[i];
            }

        }

        for (int i = 0; i < 3; i++) {

            if (max == fit[i]) {
                System.out.println("trainee no : " + (i + 1));
            }
        }

    }

}
