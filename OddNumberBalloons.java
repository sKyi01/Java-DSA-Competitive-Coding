import java.util.Scanner;



public class OddNumberBalloons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] balloons = new String[N];

        for (int i = 0; i < N; i++) {
            balloons[i] = scanner.nextLine();
        }

        for (int i = 0; i < N; i++) {
            String currentColor = balloons[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (balloons[j].equals(currentColor)) {
                    count++;
                }
            }

            if (count % 2 != 0) {
                System.out.println(currentColor);
                return;
            }
        }

        System.out.println("All are even");
    }
}
