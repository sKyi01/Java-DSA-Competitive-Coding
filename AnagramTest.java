public class AnagramTest {

    public static boolean checkAnagram(String s1, String s2) {
        boolean check = true;

        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {

                    if (s1.charAt(i) != s2.charAt(j)) {
                        check = false;

                    }
                   

                }
            }

        }

        return check;

    }

    public static void main(String[] args) {

        String s1 = "race";
        String s2 = "care";

        System.out.println(checkAnagram(s1, s2));

    }

}
