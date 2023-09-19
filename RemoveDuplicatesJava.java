public class RemoveDuplicatesJava {

    public static void main(String[] args) {

        String s = "aabbccddfffdgfdgfdggjlfdgfjg";
        String result = removeDuplicates(s);
        System.out.println("String after removing dupliates " + result);

    }

    public static String removeDuplicates(String s) {

        String remove = "";

        boolean isDuplicate = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            isDuplicate = checkDuplicate(remove, c);

            if (!isDuplicate) {

                remove += c;

            }

        }

        return remove;

    }

    public static boolean checkDuplicate(String check, char c) {

        for (int i = 0; i < check.length(); i++) {

            if (check.charAt(i) == c) {
                return true;
            }

        }
        return false;

    }
}
