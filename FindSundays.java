import java.util.Scanner;

public class FindSundays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int index = 0;

        System.out.println("Enter month start day");

        String monthDay = sc.next();

        System.out.println("Enter till days count");
        int beenDays = sc.nextInt();

        String allDays[] = { "mon", "tue", "wed", "thu", "fri", "sat", "sun" };

        for (int i = 0; i < allDays.length; i++) {
            if (allDays[i].equals(monthDay)) {
                index++;

                break;

            }

        }

        int firstSunday = 7 - index;
        beenDays = beenDays - firstSunday;
        int result = 0;

        if (beenDays > 0) {

            result = 1 + beenDays / 7;

        }

        System.out.println("Sundays appered" + result);

    }

}
