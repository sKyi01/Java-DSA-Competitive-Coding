public class PalindromicSubstrings {

    public static int countPalindromicSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes (single character center)
            count += expandAroundCenter(s, i, i);
            // Even-length palindromes (two characters center)
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            if (right - left + 1 > 1) { // Check if length of palindrome is greater than 1
                count++;
            }
            left--;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "abcbapp";
        System.out.println("Number of palindromic substrings: " + countPalindromicSubstrings(s));
    }
}
