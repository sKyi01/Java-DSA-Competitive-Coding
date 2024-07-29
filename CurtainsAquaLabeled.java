
public class CurtainsAquaLabeled {

    public static void main(String[] args) {

        String s = "bbbaaababa";
        int L = 3;
        int max = 0;
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (i % L == 0) {
                if (count > max) {
                    max = count;
                    count = 0;
                }

            }

            if (s.charAt(i) == 'a') {
                count++;

            }

        }

        System.out.println(max);

    }

}
