public class SortString {
    public static void main(String[] args) {
        String input = "example";
        String sortedString = sortString(input);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortString(String input) {
        // Convert string to char array
        char[] charArray = input.toCharArray();
        int n = charArray.length;

        // Apply Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap characters
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }

        // Convert sorted char array back to string
        return new String(charArray);
    }
}
