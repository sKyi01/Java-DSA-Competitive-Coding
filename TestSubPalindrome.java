public class TestSubPalindrome {

    public static int countSubstring(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            count += expandAroundCenter(s, i, i);
            count += expandAroundCenter(s, i, i + 1);

        }

        return count;

    }

    public static int expandAroundCenter(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {

            if(right-left+1 >0){

                count++;



            }
            left--;
            right++;

        }

        return count;

    }

    public static void main(String[] args) {

        String str = "abcbapp";

        System.out.println(countSubstring(str));

    }
}
