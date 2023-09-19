public class LongestSubStringWithoutDuplicates {

    public static void main(String[] args) {

        String s = "abdgoltpgfjfggfds";
        String result = logestSubString(s);
        System.out.println("Logest SubString is " + result);

    }

    public static String logestSubString(String s) {

        String curreString = "";
        String logeString = "";
        boolean isDuplicate = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            isDuplicate = checkDuplicate(curreString, c);

            if (isDuplicate) {

                curreString = "";

            }

            curreString += c;

            if (curreString.length() > logeString.length()) {

                logeString = curreString;
            }

        }

        return logeString;

    }

    public static boolean checkDuplicate(String cuString, char c) {

        for (int i = 0; i < cuString.length(); i++) {

            if (cuString.charAt(i) == c) {
                return true;
            }

        }
        return false;

    }
}
