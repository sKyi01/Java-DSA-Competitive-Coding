public class PalindromeCheck {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Store the original number
        int reversedNumber = 0;      // Initialize the reversed number to 0

        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;      // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number = number / 10;         // Remove the last digit
        }

        System.out.println(reversedNumber);

        // Check if the original number is equal to the reversed number
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12321; // Input number to check

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
