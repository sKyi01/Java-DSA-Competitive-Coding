
public class PossibleWaysSeatNextEachOther {

    public static void main(String[] args) {

        int peoples[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int count = 0;

        for (int i = 0; i < peoples.length; i++) {

            for (int j = 1; j < peoples.length; j++) {

                if (i - j == 1) {
                    count++;
                }

            }

        }

        System.out.println(count);

    }

}
